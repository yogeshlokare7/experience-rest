package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Sickness;
import com.experience.repository.SicknessRepository;
import com.experience.service.SicknessService;

@Service
public class SicknessServiceImpl implements SicknessService{

	@Autowired
	private SicknessRepository repo;

	@Override
	public Iterable<Sickness> getAllSickness() {
		return repo.findAll();
	}

	@Override
	public Sickness saveSickness(Sickness sickness) {
		return repo.save(sickness);
	}

	@Override
	public Sickness getSicknessById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteSickness(Integer id) {
		repo.delete(id);
	}

}
