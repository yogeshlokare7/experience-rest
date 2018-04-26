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

import com.experience.model.Freetimeactivity;
import com.experience.service.FreetimeactivityService;

@RestController
@RequestMapping("/freetimeactivity")
public class FreetimeactivityController {

	@Autowired
	private FreetimeactivityService freetimeactivityservice;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<Freetimeactivity> getAllRolesFreetimeactivity() throws Exception{
		return freetimeactivityservice.getAllFreetimeactivity();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Freetimeactivity> createRoleFreetimeactivity(@RequestBody Freetimeactivity freetimeactivity, HttpServletRequest request) throws Exception {
		Freetimeactivity createdFreetimeactivity = this.freetimeactivityservice.saveFreetimeactivity(freetimeactivity);
		return ResponseEntity.ok().body(createdFreetimeactivity);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<Freetimeactivity> getUserByUserIdFreetimeactivity(@PathVariable("id") Integer id) throws Exception {
		Freetimeactivity role = freetimeactivityservice.getFreetimeactivityById(id);
		return ResponseEntity.ok().body(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUserFreetimeactivity(@PathVariable("id") Integer id) throws Exception {
		freetimeactivityservice.deleteFreetimeactivity(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}
}
