package com.experience.service;
import java.util.List;

import com.experience.model.Rolepermission;

public interface RolePermissionService {


	public Rolepermission saveRolepermission(Rolepermission Rolepermission) throws Exception;

	public Rolepermission updateRolepermission(Rolepermission Rolepermission) throws Exception;

	public void deleteRolepermission(Integer id) throws Exception;
	
	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception;

	public List<Rolepermission> getRolepermissionList() throws Exception;
	
	public List<Rolepermission> findByRolePermission(Integer roleId);
	
	public void deleteRolepermissionByRoleId(Integer id) throws Exception;
	
	public List<Integer> findDistinctByRoleid();
	
}
