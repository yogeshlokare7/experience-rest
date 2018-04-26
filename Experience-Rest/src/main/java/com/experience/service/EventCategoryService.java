package com.experience.service;

import com.experience.model.EventCategory;

public interface EventCategoryService {
	
	public Iterable<EventCategory> getAllEventCategories();
	public EventCategory saveEventCategory(EventCategory category);
	public EventCategory getEventCategoryById(Integer Id);
	public EventCategory getEventCategoryByName(String name);
	public void deleteEventCategory(Integer id);
	

}
