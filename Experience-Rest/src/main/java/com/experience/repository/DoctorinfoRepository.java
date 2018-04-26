package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.Doctorinfo;

@Repository
public interface DoctorinfoRepository  extends CrudRepository<Doctorinfo, Serializable> {

	public Doctorinfo findById(Integer Id);
}
