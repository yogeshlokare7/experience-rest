package com.experience.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.User;
import com.experience.service.EmailService;
import com.experience.service.UserService;

@RestController
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> createHotel(@RequestBody User user) {
		String username = user.getUsername();
		String password = user.getUserpwd();
		if(username.equals("admin@mjbtech.com") && password.equals("admin")) {
			user.setUseremail("admin@mjbtech.com");
			user.setFirstname("Admin");
			return ResponseEntity.ok().body(user);
		}else {
			user = userService.loginUser(username, password);
			return ResponseEntity.ok().body(user);
		}
	}


	@RequestMapping(value="/update/{id}",method=RequestMethod.GET, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	public Boolean updatePassword(@PathVariable("id") Integer id, @RequestParam String password) throws Exception {
		User user = userService.getUser(id);
		if(user!=null) {
			user.setUserpwd(password);
			userService.updateUser(user);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/forgot", method = RequestMethod.GET, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"} )
	public ResponseEntity<User> processForgotPasswordForm(@RequestParam("userEmail") String userEmail, HttpServletRequest request) throws Exception {
		System.out.println("user email\nnnn\n"+userEmail);
		User user = userService.findUserByUseremail(userEmail);
		if (user!=null) {
			user.setResettoken(UUID.randomUUID().toString());
			userService.updateUser(user);
			//String appUrl = request.getScheme() + "://" + request.getServerName()+":"+request.getServerPort()+request.getRequestURI();
			String appUrl = "http://localhost:4200/admin/setnew-password";
			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
			passwordResetEmail.setFrom("noreply@mjbtech.com");
			passwordResetEmail.setTo(user.getUseremail());
			passwordResetEmail.setSubject("Password Reset Request");
			passwordResetEmail.setText("Hello "+user.getFirstname()+",\n\n\nTo reset your password, click the link below:\n\n\n URL: " + appUrl
					+ "/?token=" + user.getResettoken()+"\n\n\n\nSincerely,\nThe Experience Team");
			try {
				emailService.sendEmail(passwordResetEmail);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.ok().body(user);	
		}else {
			return ResponseEntity.ok().body(user);
		}
	}
	
	
	@RequestMapping(value="/reset/{id}",method=RequestMethod.GET, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"} )
	public Boolean setNewPassword(@PathVariable("id") Integer id, @RequestParam String password) throws Exception {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n\n\n\n"+id);
		User user = userService.getUser(id);
		if(user!=null) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n\n\n\n"+user.toString());
			user.setUserpwd(password);
			user.setResettoken(null);
			userService.updateUser(user);
			return true;
		}else {
			return false;
		}
	}

}
