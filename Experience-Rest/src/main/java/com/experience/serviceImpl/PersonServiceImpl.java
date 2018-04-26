package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Person;
import com.experience.repository.PersonRepository;
import com.experience.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository repo;

	@Override
	public Iterable<Person> getAllPerson() {
		return repo.findAll();
	}

	@Override
	public Person savePerson(Person person) {
		return repo.save(person);
	}

	@Override
	public Person getPersonById(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deletePerson(Integer id) {
		repo.delete(id);
		
	}

	@Override
	public List<Person> getPersonsByVenueId(Integer Id) {
		// TODO Auto-generated method stub
		return repo.findByVenueid(Id);
	}

	

}
