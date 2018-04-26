package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.EventMaster;
import com.experience.repository.EventMasterRepository;
import com.experience.service.EventService;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventMasterRepository repo;

	@Override
	public List<EventMaster> getAllEvents() {
		return repo.findAll();
	}

	@Override
	public EventMaster saveEvent(EventMaster eventMaster) {
		return repo.save(eventMaster);
	}

	@Override
	public EventMaster updateEvent(EventMaster eventMaster) {
		return repo.save(eventMaster);
	}

	@Override
	public void deleteEvent(Integer id) {
		repo.delete(id);
	}

	@Override
	public EventMaster getEvent(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void deleteEventAsObject(EventMaster eventMaster) {
		repo.delete(eventMaster);
	}

	@Override
	public void deleteAllEvent() {
		repo.deleteAll();
	}

}
