package com.experience.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*
* @author Jeevan
*/

@Entity
@Table(name="event_tracking")
public class EventTracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="eventid")
	private Integer eventid;
	
	@Column(name="studentid")
	private Integer studentid;
	
	@Column(name="checkindate")
	private Date checkindate;
	
	@Column(name="checkoutdate")
	private Date checkoutdate;
	
	@Column(name="checkedintime")
	private Time checkedintime;
	
	@Column(name="checkedouttime")
	private Time checkedouttime;
	
	@Column(name="checkedinby")
	private String checkedinby;
	
	@Column(name="checkedoutby")
	private String checkedoutby;
	
	@Column(name="remark")
	private String remark;

	
	public EventTracking() {
		
	}

	public EventTracking(Integer id, Integer eventid, Integer studentid, Date checkindate, Date checkoutdate,
			Time checkedintime, Time checkedouttime, String checkedinby, String checkedoutby, String remark) {
		super();
		this.id = id;
		this.eventid = eventid;
		this.studentid = studentid;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.checkedintime = checkedintime;
		this.checkedouttime = checkedouttime;
		this.checkedinby = checkedinby;
		this.checkedoutby = checkedoutby;
		this.remark = remark;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEventid() {
		return eventid;
	}

	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public Date getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}

	public Date getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public Time getCheckedintime() {
		return checkedintime;
	}

	public void setCheckedintime(Time checkedintime) {
		this.checkedintime = checkedintime;
	}

	public Time getCheckedouttime() {
		return checkedouttime;
	}

	public void setCheckedouttime(Time checkedouttime) {
		this.checkedouttime = checkedouttime;
	}

	public String getCheckedinby() {
		return checkedinby;
	}

	public void setCheckedinby(String checkedinby) {
		this.checkedinby = checkedinby;
	}

	public String getCheckedoutby() {
		return checkedoutby;
	}

	public void setCheckedoutby(String checkedoutby) {
		this.checkedoutby = checkedoutby;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
