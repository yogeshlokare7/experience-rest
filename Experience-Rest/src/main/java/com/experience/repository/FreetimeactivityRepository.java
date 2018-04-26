package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.experience.model.Freetimeactivity;

@Repository
public interface FreetimeactivityRepository extends CrudRepository<Freetimeactivity, Serializable> {

	public Freetimeactivity findById(Integer Id);
}
