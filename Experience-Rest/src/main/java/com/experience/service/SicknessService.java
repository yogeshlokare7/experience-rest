package com.experience.service;

import com.experience.model.Sickness;

public interface SicknessService {
	
	public Iterable<Sickness> getAllSickness();
	public Sickness saveSickness(Sickness sickness);
	public Sickness getSicknessById(Integer Id);
	public void deleteSickness(Integer id);
	
}
