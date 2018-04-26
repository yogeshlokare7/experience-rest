package com.experience.service;

import java.util.List;

import com.experience.model.EventMaster;

public interface EventService {
	
	public List<EventMaster> getAllEvents();
	public EventMaster saveEvent(EventMaster eventMaster);
	public EventMaster updateEvent(EventMaster eventMaster);
	public void deleteEvent(Integer id);
	public EventMaster getEvent(Integer id);
	public void deleteEventAsObject(EventMaster eventMaster);
	public void deleteAllEvent();

}
