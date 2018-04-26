package com.experience.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_details")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="personname")
	private String personname;
	
	@Column(name="personemail")
	private String personemail;
	
	@Column(name="personcontact")
	private String personcontact;
	
	@Column(name="persondesignation")
	private String persondesignation;
	
	@Column(name="venueid")
	private Integer venueid;

	public Person()
	{
		
	}
	public Person(Integer id, String personname, String personemail, String personcontact, String persondesignation,
			Integer venueid) {
		super();
		this.id = id;
		this.personname = personname;
		this.personemail = personemail;
		this.personcontact = personcontact;
		this.persondesignation = persondesignation;
		this.venueid = venueid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getPersonemail() {
		return personemail;
	}

	public void setPersonemail(String personemail) {
		this.personemail = personemail;
	}

	public String getPersoncontact() {
		return personcontact;
	}

	public void setPersoncontact(String personcontact) {
		this.personcontact = personcontact;
	}

	public String getPersondesignation() {
		return persondesignation;
	}

	public void setPersondesignation(String persondesignation) {
		this.persondesignation = persondesignation;
	}

	public Integer getVenueid() {
		return venueid;
	}

	public void setVenueid(Integer venueid) {
		this.venueid = venueid;
	}    
}
