package com.usermanagementservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagementservice.entity.User;
import com.usermanagementservice.repository.UserRepository;

@Service
public class UserService implements IProductService{
	@Autowired
	private UserRepository userRepository;
	
	public UserService(UserRepository repository) {
		this.userRepository=repository;
	}

	@Override
	public List<User> getAllUsers() {
		List<User>users=userRepository.findAll();
		return users;
	}

	@Override
	public User getUserById(Long userId) {
		User user=userRepository.findById(userId).get();
		return user;
	}

	@Override
	public User addUser(User user) {
		User savedUser=userRepository.save(user);
		return savedUser;
	}

	@Override
	public User deleteUser(Long userId) {
		User user=userRepository.findById(userId).get();
		userRepository.delete(user);
		return user;
	}

	@Override
	public User updateUser(User user,Long userId) {
		User user1=userRepository.findById(userId).get();
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setMobile(user.getMobile());
		user1.setPassword(user.getPassword());
		userRepository.save(user1);
		return user1;
	}
	
	
}
