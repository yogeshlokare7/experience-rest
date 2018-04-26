package com.experience.service;

import com.experience.model.Role;

public interface RoleService {

	public Role saveRole(Role role) throws Exception;

	public Role updateRole(Role role)  throws Exception;

	public void deleteRole(Integer role)  throws Exception;

	public Role getRole(Integer roleId)  throws Exception;

	public Iterable<Role> getRoleList()  throws Exception;
	
	public Role getRoleByName(String name);
}
