package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.EventTracking;

@Repository
public interface EventTrackingRepository extends CrudRepository<EventTracking, Serializable> {
	
	public EventTracking findById(Integer Id);
}
