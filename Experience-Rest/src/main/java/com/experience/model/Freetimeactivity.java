package com.experience.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="freetimeactivity")
public class Freetimeactivity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="taskname")
	private String taskname;
	
	@Column(name="taskdescription")
	private String taskdescription;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="status")
	private String status;
	
	@Column(name="totaltime")
	private Time totaltime;
	
	@Column(name="shift")
	private String shift;
	
	@Column(name="score")
	private String score;
	
	@Column(name="maxattendance")
	private int maxattendance;
	
	@Column(name="minattendance")
	private int minattendance;
	
	@Column(name="taskgroup")
	private String taskgroup;

	public Freetimeactivity() {
	
	}

	public Freetimeactivity(Integer id, String taskname, String taskdescription, String priority, String comment,
			String status, Time totaltime, String shift, String score, int maxattendance, int minattendance,
			String taskgroup) {
		super();
		this.id = id;
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.priority = priority;
		this.comment = comment;
		this.status = status;
		this.totaltime = totaltime;
		this.shift = shift;
		this.score = score;
		this.maxattendance = maxattendance;
		this.minattendance = minattendance;
		this.taskgroup = taskgroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskdescription() {
		return taskdescription;
	}

	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Time getTotaltime() {
		return totaltime;
	}

	public void setTotaltime(Time totaltime) {
		this.totaltime = totaltime;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getMaxattendance() {
		return maxattendance;
	}

	public void setMaxattendance(int maxattendance) {
		this.maxattendance = maxattendance;
	}

	public int getMinattendance() {
		return minattendance;
	}

	public void setMinattendance(int minattendance) {
		this.minattendance = minattendance;
	}

	public String getTaskgroup() {
		return taskgroup;
	}

	public void setTaskgroup(String taskgroup) {
		this.taskgroup = taskgroup;
	}

	@Override
	public String toString() {
		return "Freetimeactivity [id=" + id + ", taskname=" + taskname + ", taskdescription=" + taskdescription
				+ ", priority=" + priority + ", comment=" + comment + ", status=" + status + ", totaltime=" + totaltime
				+ ", shift=" + shift + ", score=" + score + ", maxattendance=" + maxattendance + ", minattendance="
				+ minattendance + ", taskgroup=" + taskgroup + "]";
	}
	
}
