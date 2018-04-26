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

import com.experience.model.EventTracking;
import com.experience.service.EventTrackingService;

@RestController
@RequestMapping("/event-tracking")
public class EventTrackingController {

	@Autowired
	private EventTrackingService eventTrackingService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Iterable<EventTracking> getAllRolesEventTracking() throws Exception{
		return eventTrackingService.getAllEventTracking();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EventTracking> createRoleEventTracking(@RequestBody EventTracking eventtracking, HttpServletRequest request) throws Exception {
		EventTracking createdEventTracking = this.eventTrackingService.saveEventTracking(eventtracking);
		System.out.println("createdEventTracking===="+createdEventTracking.toString());
		return ResponseEntity.ok().body(createdEventTracking);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<EventTracking> getUserByUserIdEventTracking(@PathVariable("id") Integer id) throws Exception {
		EventTracking role = eventTrackingService.getEventTrackingById(id);
		return ResponseEntity.ok().body(role);
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUserEventTracking(@PathVariable("id") Integer id) throws Exception {
		eventTrackingService.deleteEventTracking(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}
	
}
