package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Rolepermission;
import com.experience.repository.RolePermissionRepository;
import com.experience.service.RolePermissionService;

@Service
public class RolePermissionServiceImpl implements RolePermissionService{
	
	@Autowired
	private RolePermissionRepository repo;

	@Override
	public Rolepermission saveRolepermission(Rolepermission rolepermission) throws Exception {
		return repo.save(rolepermission);
	}

	@Override
	public Rolepermission updateRolepermission(Rolepermission rolepermission) throws Exception {
		return repo.save(rolepermission);
	}

	@Override
	public void deleteRolepermission(Integer rolepermission) throws Exception {
		repo.delete(rolepermission);
	}

	@Override
	public Rolepermission getRolepermission(Integer RolepermissionId) throws Exception {
		return repo.findOne(RolepermissionId);
	}

	@Override
	public List<Rolepermission> getRolepermissionList() throws Exception {
		return repo.findAll();
	}

	@Override
	public List<Rolepermission> findByRolePermission(Integer roleid) {
		return repo.findByRoleid(roleid);
	}

	@Override
	public void deleteRolepermissionByRoleId(Integer id) throws Exception {
		repo.deleteInBatch(findByRolePermission(id));
	}

	@Override
	public List<Integer> findDistinctByRoleid() {
		return repo.findDistinctRoleid();
	}

}
