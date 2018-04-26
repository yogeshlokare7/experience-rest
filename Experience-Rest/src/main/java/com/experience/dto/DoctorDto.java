package com.experience.dto;

import java.sql.Time;

public class DoctorDto {

	private Integer id;	
	private String fullname;	
	private String salutation;	
	private String docdesc;	
	private String doccategory;
	private String fees;
	private Time availablefrom;
	private Time availableto;
	private String contactno1;
	private String contactno2;
	private String faxno1;
	private String faxno2;
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
		return "DoctorDto [id=" + id + ", fullname=" + fullname + ", salutation=" + salutation + ", docdesc=" + docdesc
				+ ", doccategory=" + doccategory + ", fees=" + fees + ", availablefrom=" + availablefrom
				+ ", availableto=" + availableto + ", contactno1=" + contactno1 + ", contactno2=" + contactno2
				+ ", faxno1=" + faxno1 + ", faxno2=" + faxno2 + "]";
	}
	
}
