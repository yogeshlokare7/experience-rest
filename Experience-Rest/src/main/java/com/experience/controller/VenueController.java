package com.experience.controller;

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

import com.experience.dto.VenueDto;
import com.experience.model.Person;
import com.experience.model.VenueMaster;
import com.experience.service.PersonService;
import com.experience.service.VenueService;

@RestController
@RequestMapping("/venue")
public class VenueController {
	
	@Autowired
	private VenueService venueService;
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<VenueMaster> getAllVenues() throws Exception{
		return venueService.getAllVenues();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<VenueDto> createVenue(@RequestBody VenueDto venueDto, HttpServletRequest request) throws Exception {
		//VenueMaster venueMaster2 = this.venueService.saveVenue(venueMaster);
		System.out.println("============\n\n"+venueDto.toString());
		VenueMaster venueMaster =  venueDto.getModelFromDTO();
		System.out.println("======MASTER======\n\n"+venueMaster.toString());
		VenueMaster venueMaster2 = venueService.saveVenue(venueMaster);
		List<Person> persons = venueDto.getVenueContacts();
		System.out.println("persons="+persons);
		for(Person person:persons) {
			if(person!=null) {
				person.setVenueid(venueMaster2.getId());
				personService.savePerson(person);
			}
		}
		return ResponseEntity.ok().body(venueDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ResponseEntity<VenueDto> getVenueById(@PathVariable("id") Integer id) throws Exception {
		VenueMaster venueMaster = venueService.getVenue(id);
		List<Person> persons = personService.getPersonsByVenueId(venueMaster.getId());
		VenueDto venueDto = new VenueDto();
		venueDto.setVenueContacts(persons);
		return ResponseEntity.ok().body(venueDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json", "application/xml"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) throws Exception {
		venueService.deleteVenue(id);
		return ResponseEntity.ok().body("Successfully removed account of user");
	}
	

}
