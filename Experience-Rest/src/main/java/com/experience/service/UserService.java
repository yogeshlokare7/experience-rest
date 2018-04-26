package com.experience.service;

import com.experience.model.User;

public interface UserService {
	public Iterable<User> getUsers();
	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(Integer id);
	public User getUser(Integer id);
	public User loginUser(String username, String password);
	public User findUserByUseremail(String userEmail);
	
}
                                                     




