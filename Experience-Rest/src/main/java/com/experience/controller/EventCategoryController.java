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

import com.experience.model.EventCategory;
import com.experience.service.EventCategoryService;

@RestController
@RequestMapping("/event-category")
public class EventCategoryController {
	
	@Autowired
	private EventCategoryService eventCategoryService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<EventCategory> getAllRoles() throws Exception{
		return eventCategoryService.getAllEventCategories();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EventCategory> createRole(@RequestBody EventCategory category, HttpServletRequest request) throws Exception {
		EventCategory createdEventCategory = this.eventCategoryService.saveEventCategory(category);
		System.out.println("createdEventCategory=="+createdEventCategory);
		return ResponseEntity.ok().body(createdEventCategory);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<EventCategory> getUserByUserId(@PathVariable("id") Integer id) throws Exception {
		EventCategory role = eventCategoryService.getEventCategoryById(id);
		return ResponseEntity.ok().body(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) throws Exception {
		eventCategoryService.deleteEventCategory(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}

}
