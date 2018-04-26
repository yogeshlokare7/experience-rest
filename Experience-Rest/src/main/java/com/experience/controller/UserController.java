package com.experience.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.User;
import com.experience.service.EmailService;
import com.experience.service.UserService;
import com.experience.util.PasswordUtils;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private EmailService emailService;


	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<User> getAllUsers() {
		return userService.getUsers();
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> createHotel(@RequestBody User user, HttpServletRequest request) {
		if(user.getId()!=null && user.getId()>0) {
			User user2 =  userService.getUser(user.getId());
			user.setUserpwd(user2.getUserpwd());
			User newuser = userService.saveUser(user);
			return ResponseEntity.ok().body(newuser);
		}else {
			@SuppressWarnings("static-access")
			String password = new PasswordUtils().generateRandomPassword();
			user.setUserpwd(password);
			User newuser = userService.saveUser(user);
			String appUrl = request.getScheme() + "://" + request.getServerName()+":"+request.getServerPort()+"/experience";
			SimpleMailMessage registrationEmail = new SimpleMailMessage();
			registrationEmail.setTo(newuser.getUseremail());
			registrationEmail.setSubject("Experience Online Service Team");
			registrationEmail.setText("Hello "+newuser.getFirstname()+",\n\n\nUser account created with below details:\n\nUsername: "+newuser.getUseremail()+"\nPassword:"+newuser.getUserpwd()
			+ "\n\n\nPlease login here:" +appUrl +"\n\n\nSincerely,\nThe Experience Team");
			registrationEmail.setFrom("noreply@domain.com");
			try {
				emailService.sendEmail(registrationEmail);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.ok().body(newuser);
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<User> getUserByUserId(@PathVariable("id") Integer id) {
		User user = userService.getUser(id);
		return ResponseEntity.ok().body(user);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}

}
