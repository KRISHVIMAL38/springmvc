package com.usermanagementservice.service;

import java.util.List;

import com.usermanagementservice.entity.User;

public interface IProductService {
	public List<User>getAllUsers();
	public User getUserById(Long userId);
	public User addUser(User user);
	public User deleteUser(Long userId);
	public User updateUser(User user,Long userId);
}
