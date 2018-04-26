package com.experience.dto;

public class PersonDto {

	private Integer id;
	private String personname;
	private String personemail;
	private Integer personcontact;
	private Integer persondesignation;
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
	public Integer getPersoncontact() {
		return personcontact;
	}
	public void setPersoncontact(Integer personcontact) {
		this.personcontact = personcontact;
	}
	public Integer getPersondesignation() {
		return persondesignation;
	}
	public void setPersondesignation(Integer persondesignation) {
		this.persondesignation = persondesignation;
	}
	
	@Override
	public String toString() {
		return "PersonDto [id=" + id + ", personname=" + personname + ", personemail=" + personemail
				+ ", personcontact=" + personcontact + ", persondesignation=" + persondesignation + "]";
	}
	
	
}
