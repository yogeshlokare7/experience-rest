package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.EventVenueMapping;
import com.experience.repository.EventVenueMappingRepository;
import com.experience.service.EventVenueMappingService;

@Service
public class EventVenueMappingServiceImpl implements EventVenueMappingService{
	
	@Autowired
	private EventVenueMappingRepository eventVenueMappingRepository;

	@Override
	public Iterable<EventVenueMapping> getAllEventCategories() {
		return eventVenueMappingRepository.findAll();
	}

	@Override
	public EventVenueMapping saveEventVenueMapping(EventVenueMapping eventVenueMapping) {
		return eventVenueMappingRepository.save(eventVenueMapping);
	}

	@Override
	public EventVenueMapping getEventVenueMappingById(Integer id) {
		return eventVenueMappingRepository.findOne(id);
	}

	@Override
	public void deleteEventVenueMapping(Integer id) {
		eventVenueMappingRepository.delete(id);
	}
	
	
}
