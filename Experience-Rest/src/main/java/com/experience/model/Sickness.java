package com.experience.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sickness")
public class Sickness {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="sicknessname")
	private String sicknessname;
	
	@Column(name="sicknessdesc")
	private String sicknessdesc;
	
	@Column(name="notes")
	private String notes;
	
	@Column(name="medicine")
	private String medicine;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="recdoctor")
	private String recdoctor;

	public Sickness() {
		
	}
	public Sickness(Integer id, String sicknessname, String sicknessdesc, String notes, String medicine, Double amount,
			String recdoctor) {
		super();
		this.id = id;
		this.sicknessname = sicknessname;
		this.sicknessdesc = sicknessdesc;
		this.notes = notes;
		this.medicine = medicine;
		this.amount = amount;
		this.recdoctor = recdoctor;
	}

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
		return "Sickness [id=" + id + ", sicknessname=" + sicknessname + ", sicknessdesc=" + sicknessdesc + ", notes="
				+ notes + ", medicine=" + medicine + ", amount=" + amount + ", recdoctor=" + recdoctor + "]";
	}
	
}
