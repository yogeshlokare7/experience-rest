package com.experience.model;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rolepermission")
public class Rolepermission  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer permId;
	private Integer roleid;

	
	public Rolepermission() {
	}

	public Rolepermission(Integer id, Integer permId, Integer roleid) {
		this.id = id;
		this.permId = permId;
		this.roleid = roleid;
	}

	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="permissionid")
	public Integer getPermId() {
		return permId;
	}

	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	@Column(name="roleid")
	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "Rolepermission [id=" + id + ", permId=" + permId + ", roleid=" + roleid + "]";
	}
	
	
	
}


