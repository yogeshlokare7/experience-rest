package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.experience.model.EventCategory;

public interface EventCategoryRepository extends CrudRepository<EventCategory, Serializable> {
	
	public EventCategory findByName(String name);

}
