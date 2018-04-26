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

import com.experience.model.Sickness;
import com.experience.service.SicknessService;

@RestController
@RequestMapping("/sickness")
public class SicknessController {

	@Autowired
	private SicknessService sicknessService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<Sickness> getAllRolesSickness() throws Exception{
		return sicknessService.getAllSickness();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Sickness> createRoleSickness(@RequestBody Sickness sickness, HttpServletRequest request) throws Exception {
		Sickness createdSickness = this.sicknessService.saveSickness(sickness);
		return ResponseEntity.ok().body(createdSickness);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<Sickness> getUserByUserIdSickness(@PathVariable("id") Integer id) throws Exception {
		Sickness role = sicknessService.getSicknessById(id);
		return ResponseEntity.ok().body(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUserDeviation(@PathVariable("id") Integer id) throws Exception {
		sicknessService.deleteSickness(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}
}
