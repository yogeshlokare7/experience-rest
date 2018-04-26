package com.experience.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.Role;
import com.experience.repository.RoleRepository;
import com.experience.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepo;
	
	@Override
	public Role saveRole(Role role) throws Exception {
		return roleRepo.save(role);
	}

	@Override
	public Role updateRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		return roleRepo.save(role);
	}

	@Override
	public void deleteRole(Integer role) throws Exception {
		// TODO Auto-generated method stub
		roleRepo.delete(role);
	}

	@Override
	public Role getRole(Integer roleId) throws Exception {
		// TODO Auto-generated method stub
		return roleRepo.findOne(roleId);
	}

	@Override
	public Iterable<Role> getRoleList() throws Exception {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}

	@Override
	public Role getRoleByName(String name) {
		// TODO Auto-generated method stub
		return roleRepo.findByRole(name);
	}


	
	
}
