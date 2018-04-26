package com.experience.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.experience.model.Person;

public interface PersonRepository extends CrudRepository<Person, Serializable> {

	public Person findById(Integer Id);
	public List<Person> findByVenueid(Integer venueid);
}
