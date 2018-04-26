package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.Sickness;

@Repository
public interface SicknessRepository  extends CrudRepository<Sickness, Serializable> {

	public Sickness findById(Integer Id);
}
