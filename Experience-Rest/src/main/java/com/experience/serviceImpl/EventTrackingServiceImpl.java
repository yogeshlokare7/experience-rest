package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.EventTracking;
import com.experience.repository.EventTrackingRepository;
import com.experience.service.EventTrackingService;



@Service
public class EventTrackingServiceImpl implements EventTrackingService{

	@Autowired
	private EventTrackingRepository repo;

	@Override
	public Iterable<EventTracking> getAllEventTracking() {
		return repo.findAll();
	}

	@Override
	public EventTracking saveEventTracking(EventTracking tracking) {
		return repo.save(tracking);
	}

	@Override
	public EventTracking getEventTrackingById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteEventTracking(Integer id) {
		repo.delete(id);
	}
	
	

}
