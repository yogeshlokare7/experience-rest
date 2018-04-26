package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.UserPermission;
import com.experience.repository.UserPermissionRepository;
import com.experience.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private UserPermissionRepository repo;
	
	@Override
	public UserPermission savePermission(UserPermission permission) {
		return repo.save(permission);
	}

	@Override
	public UserPermission updatePermission(UserPermission permission) {
		return repo.save(permission);
	}

	@Override
	public void deletePermission(Integer permissionId) {
		repo.delete(permissionId);
	}

	@Override
	public UserPermission getPermission(Integer permissionId) {	
		return repo.findOne(permissionId);
	}

	@Override
	public Iterable<UserPermission> getPermissionList() {
		return repo.findAll();
	}

}
