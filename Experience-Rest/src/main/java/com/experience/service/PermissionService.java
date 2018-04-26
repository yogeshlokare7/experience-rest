package com.experience.service;

import com.experience.model.UserPermission;


public interface PermissionService {
	
	public UserPermission savePermission(UserPermission permission);

	public UserPermission updatePermission(UserPermission permission);

	public void deletePermission(Integer permissionId);

	public UserPermission getPermission(Integer permissionId);

	public Iterable<UserPermission> getPermissionList();
	
}
