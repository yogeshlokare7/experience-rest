package com.experience.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctorinfo")
public class Doctorinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="salutation")
	private String salutation;
	
	@Column(name="docdesc")
	private String docdesc;
	
	@Column(name="doccategory")
	private String doccategory;
	
	@Column(name="fees")
	private String fees;
	
	@Column(name="availablefrom")
	private Time availablefrom;
	
	@Column(name="availableto")
	private Time availableto;
	
	@Column(name="contactno1")
	private String contactno1;
	
	@Column(name="contactno2")
	private String contactno2;
	
	@Column(name="faxno1")
	private String faxno1;
	
	@Column(name="faxno2")
	private String faxno2;

	
	public Doctorinfo() {
		
	}

	public Doctorinfo(Integer id, String fullname, String salutation, String docdesc, String doccategory, String fees,
			Time availablefrom, Time availableto, String contactno1, String contactno2, String faxno1, String faxno2) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.salutation = salutation;
		this.docdesc = docdesc;
		this.doccategory = doccategory;
		this.fees = fees;
		this.availablefrom = availablefrom;
		this.availableto = availableto;
		this.contactno1 = contactno1;
		this.contactno2 = contactno2;
		this.faxno1 = faxno1;
		this.faxno2 = faxno2;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getDocdesc() {
		return docdesc;
	}

	public void setDocdesc(String docdesc) {
		this.docdesc = docdesc;
	}

	public String getDoccategory() {
		return doccategory;
	}

	public void setDoccategory(String doccategory) {
		this.doccategory = doccategory;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public Time getAvailablefrom() {
		return availablefrom;
	}

	public void setAvailablefrom(Time availablefrom) {
		this.availablefrom = availablefrom;
	}

	public Time getAvailableto() {
		return availableto;
	}

	public void setAvailableto(Time availableto) {
		this.availableto = availableto;
	}

	public String getContactno1() {
		return contactno1;
	}

	public void setContactno1(String contactno1) {
		this.contactno1 = contactno1;
	}

	public String getContactno2() {
		return contactno2;
	}

	public void setContactno2(String contactno2) {
		this.contactno2 = contactno2;
	}

	public String getFaxno1() {
		return faxno1;
	}

	public void setFaxno1(String faxno1) {
		this.faxno1 = faxno1;
	}

	public String getFaxno2() {
		return faxno2;
	}

	public void setFaxno2(String faxno2) {
		this.faxno2 = faxno2;
	}

	@Override
	public String toString() {
		return "Doctorinfo [id=" + id + ", fullname=" + fullname + ", salutation=" + salutation + ", docdesc=" + docdesc
				+ ", doccategory=" + doccategory + ", fees=" + fees + ", availablefrom=" + availablefrom
				+ ", availableto=" + availableto + ", contactno1=" + contactno1 + ", contactno2=" + contactno2
				+ ", faxno1=" + faxno1 + ", faxno2=" + faxno2 + "]";
	}
	
	
}
