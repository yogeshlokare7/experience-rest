package com.experience.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.Doctorinfo;
import com.experience.service.DoctorinfoService;

@RestController
@RequestMapping("/doctorinfo")
public class DoctorinfoController {

	@Autowired
	private DoctorinfoService doctorinfoservice;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<Doctorinfo> getAllRolesDoctorinfo() throws Exception{
		return doctorinfoservice.getAllDoctorinfo();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Doctorinfo> createRoleDoctorinfo(@RequestBody Doctorinfo doctorinfo, HttpServletRequest request) throws Exception {
		Doctorinfo createdDoctorinfo = this.doctorinfoservice.saveDoctorinfo(doctorinfo);
		return ResponseEntity.ok().body(createdDoctorinfo);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<Doctorinfo> getUserByUserIdDoctorinfo(@PathVariable("id") Integer id) throws Exception {
		Doctorinfo role = doctorinfoservice.getDoctorinfoById(id);
		return ResponseEntity.ok().body(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUserDoctorinfo(@PathVariable("id") Integer id) throws Exception {
		doctorinfoservice.deleteDoctorinfo(id);
		return ResponseEntity.ok().body("Successfully removed account doctor info of user");
	}
}
