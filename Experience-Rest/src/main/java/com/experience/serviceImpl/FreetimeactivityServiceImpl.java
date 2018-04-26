package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Freetimeactivity;
import com.experience.repository.FreetimeactivityRepository;
import com.experience.service.FreetimeactivityService;

@Service
public class FreetimeactivityServiceImpl implements FreetimeactivityService{

	@Autowired
	private FreetimeactivityRepository repo;
	
	@Override
	public Iterable<Freetimeactivity> getAllFreetimeactivity() {
		return repo.findAll();
	}

	@Override
	public Freetimeactivity saveFreetimeactivity(Freetimeactivity freetimeactivity) {
		return repo.save(freetimeactivity);
	}

	@Override
	public Freetimeactivity getFreetimeactivityById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteFreetimeactivity(Integer id) {
		repo.delete(id);
		
	}

}
