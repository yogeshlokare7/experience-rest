package com.experience.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.experience.dto.EventDto;
import com.experience.model.EventMaster;
import com.experience.model.EventVenueMapping;
import com.experience.model.VenueMaster;
import com.experience.service.EventService;
import com.experience.service.EventVenueMappingService;
import com.experience.service.VenueService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private VenueService venueService;
	
	@Autowired
	private EventVenueMappingService eventVenueMappingService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<EventMaster> getAllEvents() throws Exception{
		return eventService.getAllEvents();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto, HttpServletRequest request) throws Exception {
		System.out.println("\n\n"+eventDto.toString()+"\n\n");
		EventMaster eventMaster = getModelFromDTO(eventDto);
		System.out.println("\n\n"+eventMaster.toString()+"\n\n");
		EventMaster eventMaster2 = this.eventService.saveEvent(eventMaster);
		System.out.println("\n\n"+eventMaster2.toString()+"\n\n");
		List<VenueMaster> masters = eventDto.getVenueMasters();
		List<VenueMaster> venueMasters = new ArrayList<VenueMaster>();
		for(VenueMaster venueMaster : masters) {
			if(venueMaster!=null && venueMaster.getVenuename()!=null && venueMaster.getVenuename()==" ") {
				VenueMaster venueMaster2 = venueService.saveVenue(venueMaster);
				EventVenueMapping eventVenueMapping = new EventVenueMapping();
				eventVenueMapping.setEventId(eventMaster2.getId());
				eventVenueMapping.setVenueId(venueMaster2.getId());
				eventVenueMappingService.saveEventVenueMapping(eventVenueMapping);
				venueMasters.add(venueMaster2);
			}
		}
		for(Integer venueId : eventDto.getVenueIds()) {
			if(venueId!=null && venueId>0) {
				EventVenueMapping eventVenueMapping2 = new EventVenueMapping();
				eventVenueMapping2.setEventId(eventMaster2.getId());
				eventVenueMapping2.setVenueId(venueId);
				eventVenueMappingService.saveEventVenueMapping(eventVenueMapping2);
			}
		}
		EventDto eventDto2 = getDTOFromModel(eventMaster2, venueMasters);
		eventDto2.setVenueIds(eventDto.getVenueIds());
		return ResponseEntity.ok().body(eventDto2);
	}
	
	
	private EventDto getDTOFromModel(EventMaster eventMaster2, List<VenueMaster> venueMasters) {
		EventDto eventDto = new EventDto();
		eventDto.setAmount(eventMaster2.getAmount());
		eventDto.setComments(eventMaster2.getComments());
		eventDto.setEventcategory(eventMaster2.getEventcategory());
		eventDto.setEventName(eventMaster2.getEventName());
		eventDto.setEventStatus(eventMaster2.getEventStatus());
		eventDto.setId(eventMaster2.getId());
		eventDto.setNoOfSeats(eventMaster2.getNoOfSeats());
		eventDto.setNoOfSeatsSold(eventMaster2.getNoOfSeatsSold());
		eventDto.setOraganizerName(eventMaster2.getOraganizerName());
		eventDto.setOtherDetails(eventMaster2.getOtherDetails());
		eventDto.setStartDate(eventMaster2.getStartDate());
		eventDto.setEndDate(eventMaster2.getEndDate());
		eventDto.setTaxAmount(eventMaster2.getTaxAmount());
		eventDto.setVenue(eventMaster2.getVenue());
		eventDto.setVenueMasters(venueMasters);
		return eventDto;
	}

	private EventMaster getModelFromDTO(EventDto eventDto) {
		EventMaster eventMaster = new EventMaster();
		if(eventDto.getId()!=null && eventDto.getId()>0) {
			eventMaster.setId(eventDto.getId());
		}
		eventMaster.setEventName(eventDto.getEventName());
		eventMaster.setOraganizerName(eventDto.getOraganizerName());
		eventMaster.setEventStatus(eventDto.getEventStatus());
		eventMaster.setVenue(eventDto.getVenue());
		eventMaster.setAmount(eventDto.getAmount());
		eventMaster.setComments(eventDto.getComments());
		eventMaster.setEndDate(eventDto.getEndDate());
		eventMaster.setEventcategory(eventDto.getEventcategory());
		eventMaster.setNoOfSeats(eventDto.getNoOfSeats());
		eventMaster.setNoOfSeatsSold(eventDto.getNoOfSeatsSold());
		eventMaster.setOtherDetails(eventDto.getOtherDetails());
		eventMaster.setStartDate(eventDto.getStartDate());
		eventMaster.setTaxAmount(eventDto.getTaxAmount());
		return eventMaster;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EventDto> UpdateEvent(@PathVariable("id") Integer id, @RequestBody EventDto eventDto) throws Exception {
		System.out.println("\n\n"+eventDto.toString()+"\n\n");
		EventMaster eventMaster = eventService.getEvent(id);
		eventMaster = getModelFromDTO(eventDto);
		System.out.println("\n\n"+eventMaster.toString()+"\n\n");
		EventMaster eventMaster2 = eventService.saveEvent(eventMaster);
		System.out.println("\n\n"+eventMaster2.toString()+"\n\n");
		List<VenueMaster> masters = eventDto.getVenueMasters();
		List<VenueMaster> venueMasters = new ArrayList<VenueMaster>();
		for(VenueMaster venueMaster : masters) {
			if(venueMaster.getId()==null) {
				VenueMaster venueMaster2 = venueService.saveVenue(venueMaster);
				EventVenueMapping eventVenueMapping = new EventVenueMapping();
				eventVenueMapping.setEventId(eventMaster2.getId());
				eventVenueMapping.setVenueId(venueMaster2.getId());
				eventVenueMappingService.saveEventVenueMapping(eventVenueMapping);
				venueMasters.add(venueMaster2);
			}else {
				EventVenueMapping eventVenueMapping = new EventVenueMapping();
				eventVenueMapping.setEventId(eventMaster2.getId());
				eventVenueMapping.setVenueId(venueMaster.getId());
				eventVenueMappingService.saveEventVenueMapping(eventVenueMapping);
				venueMasters.add(venueMaster);
			}
		}
//		for(Integer venueId : eventDto.getVenueIds()) {
//			if(venueId!=null && venueId>0) {
//				EventVenueMapping eventVenueMapping2 = new EventVenueMapping();
//				eventVenueMapping2.setEventId(eventMaster2.getId());
//				eventVenueMapping2.setVenueId(venueId);
//				eventVenueMappingService.saveEventVenueMapping(eventVenueMapping2);
//			}
//		}
		EventDto eventDto2 = getDTOFromModel(eventMaster2, venueMasters);
		//eventDto2.setVenueIds(eventDto.getVenueIds());
		return ResponseEntity.ok().body(eventDto2);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<EventMaster> getEventById(@PathVariable("id") Integer id) throws Exception {
		EventMaster eventMaster = eventService.getEvent(id);
		return ResponseEntity.ok().body(eventMaster);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) throws Exception {
		eventService.deleteEvent(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}

}
