package com.experience.dto;

import java.sql.Time;

public class FreetimeactivityDto {

	private Integer id;	
	private String taskname;
	private String taskdescription;
	private String priority;
	private String comment;
	private String status;	
	private Time totaltime;
	private String shift;
	private String score;
	private int maxattendance;
	private int minattendance;
	private String taskgroup;
	
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
		return "FreetimeactivityDto [id=" + id + ", taskname=" + taskname + ", taskdescription=" + taskdescription
				+ ", priority=" + priority + ", comment=" + comment + ", status=" + status + ", totaltime=" + totaltime
				+ ", shift=" + shift + ", score=" + score + ", maxattendance=" + maxattendance + ", minattendance="
				+ minattendance + ", taskgroup=" + taskgroup + "]";
	}
	
}
