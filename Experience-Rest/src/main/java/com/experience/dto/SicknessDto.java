package com.experience.dto;

public class SicknessDto {

	private Integer id;
	private String sicknessname;
	private String sicknessdesc;
	private String notes;
	private String medicine;
	private Double amount;
	private String recdoctor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSicknessname() {
		return sicknessname;
	}
	public void setSicknessname(String sicknessname) {
		this.sicknessname = sicknessname;
	}
	public String getSicknessdesc() {
		return sicknessdesc;
	}
	public void setSicknessdesc(String sicknessdesc) {
		this.sicknessdesc = sicknessdesc;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getRecdoctor() {
		return recdoctor;
	}
	public void setRecdoctor(String recdoctor) {
		this.recdoctor = recdoctor;
	}
	@Override
	public String toString() {
		return "SicknessDto [id=" + id + ", sicknessname=" + sicknessname + ", sicknessdesc=" + sicknessdesc
				+ ", notes=" + notes + ", medicine=" + medicine + ", amount=" + amount + ", recdoctor=" + recdoctor
				+ "]";
	}
	
}
