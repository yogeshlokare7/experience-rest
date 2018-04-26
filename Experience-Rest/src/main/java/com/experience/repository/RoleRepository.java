package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Serializable>{
	
	public Role findByRole(String role);

}
