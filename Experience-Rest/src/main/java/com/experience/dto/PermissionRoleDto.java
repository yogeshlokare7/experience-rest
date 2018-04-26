package com.experience.dto;

import java.util.List;

import com.experience.model.Role;
import com.experience.model.UserPermission;

public class PermissionRoleDto {
	private Role role;
	private List<UserPermission> rolePermissions;
	public PermissionRoleDto() {
	}
	
	public PermissionRoleDto(Role role, List<UserPermission> rolePermissions) {
		this.role = role;
		this.rolePermissions = rolePermissions;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<UserPermission> getRolePermissions() {
		return rolePermissions;
	}
	public void setRolePermissions(List<UserPermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	@Override
	public String toString() {
		return "PermissionRoleDto [role=" + role + ", rolePermissions=" + rolePermissions + "]";
	}
	
}
