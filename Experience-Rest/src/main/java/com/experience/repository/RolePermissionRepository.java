package com.experience.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.experience.model.Rolepermission;

@Repository
public interface RolePermissionRepository extends JpaRepository<Rolepermission, Serializable>{
	
	public List<Rolepermission> findByRoleid(Integer roleid);
	
	@Query("SELECT DISTINCT roleid FROM Rolepermission")
	List<Integer> findDistinctRoleid();
	
}
