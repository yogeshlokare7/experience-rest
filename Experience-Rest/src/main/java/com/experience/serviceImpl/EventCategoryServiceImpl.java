package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.EventCategory;
import com.experience.repository.EventCategoryRepository;
import com.experience.service.EventCategoryService;

@Service
public class EventCategoryServiceImpl implements EventCategoryService{
	
	@Autowired
	private EventCategoryRepository repo;

	@Override
	public Iterable<EventCategory> getAllEventCategories() {
		return repo.findAll();
	}

	@Override
	public EventCategory saveEventCategory(EventCategory category) {
		return repo.save(category);
	}

	@Override
	public EventCategory getEventCategoryById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public EventCategory getEventCategoryByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public void deleteEventCategory(Integer id) {
		repo.delete(id);
		
	}
	

}
