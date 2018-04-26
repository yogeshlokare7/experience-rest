package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Doctorinfo;
import com.experience.repository.DoctorinfoRepository;
import com.experience.service.DoctorinfoService;

@Service
public class DoctorinfoServiceImpl implements DoctorinfoService{

	@Autowired
	private DoctorinfoRepository repo;

	@Override
	public Iterable<Doctorinfo> getAllDoctorinfo() {
		return repo.findAll();
	}

	@Override
	public Doctorinfo saveDoctorinfo(Doctorinfo doctorinfo) {
		return repo.save(doctorinfo);
	}

	@Override
	public Doctorinfo getDoctorinfoById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteDoctorinfo(Integer id) {
		repo.delete(id);
	}

	

}
