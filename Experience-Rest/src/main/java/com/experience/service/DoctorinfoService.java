package com.experience.service;

import com.experience.model.Doctorinfo;

public interface DoctorinfoService {
	
	public Iterable<Doctorinfo> getAllDoctorinfo();
	public Doctorinfo saveDoctorinfo(Doctorinfo doctorinfo);
	public Doctorinfo getDoctorinfoById(Integer Id);
	public void deleteDoctorinfo(Integer id);
	
}
