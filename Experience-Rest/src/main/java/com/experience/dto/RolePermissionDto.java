package com.experience.dto;
import java.util.Arrays;

public class RolePermissionDto{
	private Integer roleId;
	private Integer[] permissionIds;
	
	public RolePermissionDto() {
	}

	public RolePermissionDto(Integer roleId, Integer[] permissionIds) {
		this.roleId = roleId;
		this.permissionIds = permissionIds;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer[] getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(Integer[] permissionIds) {
		this.permissionIds = permissionIds;
	}

	@Override
	public String toString() {
		return "RolePermissionDto [roleId=" + roleId + ", permissionIds=" + Arrays.toString(permissionIds) + "]";
	}
	
	
	
	
}


