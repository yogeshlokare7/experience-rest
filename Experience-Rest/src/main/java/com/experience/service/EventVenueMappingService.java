package com.experience.service;

import com.experience.model.EventVenueMapping;

public interface EventVenueMappingService {

	public Iterable<EventVenueMapping> getAllEventCategories();
	public EventVenueMapping saveEventVenueMapping(EventVenueMapping eventVenueMapping);
	public EventVenueMapping getEventVenueMappingById(Integer id);
	public void deleteEventVenueMapping(Integer id);
}
