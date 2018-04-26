package com.experience.service;

import com.experience.model.Freetimeactivity;

public interface FreetimeactivityService {

	public Iterable<Freetimeactivity> getAllFreetimeactivity();
	public Freetimeactivity saveFreetimeactivity(Freetimeactivity freetimeactivity);
	public Freetimeactivity getFreetimeactivityById(Integer Id);
	public void deleteFreetimeactivity(Integer id);
	
}
