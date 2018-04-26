package com.experience.repository;

import org.springframework.data.repository.CrudRepository;

import com.experience.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByUsername(String username);
	User findByUseremail(String email);
	User findByResettoken(String token);
	User findByUsernameAndUserpwd(String username, String userPwd);
}

