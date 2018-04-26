package com.experience.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.User;
import com.experience.repository.UserRepository;
import com.experience.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> getUsers() {
		Iterable<User> user = userRepository.findAll();
		return user;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public User getUser(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public User loginUser(String username, String password) {
		return userRepository.findByUsernameAndUserpwd(username, password);
	}

	@Override
	public User findUserByUseremail(String userEmail) {
		return userRepository.findByUseremail(userEmail);
	}
	
}
