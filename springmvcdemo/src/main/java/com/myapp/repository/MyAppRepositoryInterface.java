package com.myapp.repository;

import java.util.List;

import com.myapp.model.User;

public interface MyAppRepositoryInterface {
	
	public boolean saveUser(User user);

	public List<User> getAllUsers();

	User getUserById(String userId,String userPassword);

}