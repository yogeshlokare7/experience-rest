package com.experience.service;

import com.experience.model.EventTracking;

public interface EventTrackingService {
	
	public Iterable<EventTracking> getAllEventTracking();
	public EventTracking saveEventTracking(EventTracking tracking);
	public EventTracking getEventTrackingById(Integer Id);
	public void deleteEventTracking(Integer id);
	
}
