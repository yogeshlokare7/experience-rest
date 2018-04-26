package com.experience.dto;

public class PermissionDto  {

	private Integer id;
	private String name;
	private String active;

	public PermissionDto() {
	}

	public PermissionDto(Integer id, String name, String active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "PermissionDto [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
	
	

}


