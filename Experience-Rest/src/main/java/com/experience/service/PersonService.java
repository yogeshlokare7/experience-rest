package com.experience.service;

import java.util.List;

import com.experience.model.Person;

public interface PersonService {
	
	public Iterable<Person> getAllPerson();
	public Person savePerson(Person person);
	public Person getPersonById(Integer Id);
	public void deletePerson(Integer id);
	public List<Person> getPersonsByVenueId(Integer Id);
	
}
