package com.experience.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experience.model.UserPermission;

@Repository
public interface UserPermissionRepository extends CrudRepository<UserPermission, Serializable>{

}
