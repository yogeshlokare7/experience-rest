package com.experience.model;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userpermission")
public class UserPermission  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String description;

	public UserPermission() {
	}

	

	public UserPermission(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}



	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name="name", length=50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name="description", length=70)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}


