package com.myapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.model.User;

@Repository
public class MyAppRepositoryImpl{

	@Autowired
	JdbcTemplate jdbcTemplate;

	public MyAppRepositoryImpl() {
		
	}

	public int saveUser(User user) {
		int res=jdbcTemplate.update(UserQueryConstants.INSERT, user.getUserno(), user.getUserid(), user.getUserpassword(),
				user.getDob(),user.getGender(), user.getAddress(), user.getCity(), user.getState(), user.getUsercreationdate());
		System.out.println("User Saved into DB  : " + user.getUserid());
		return res;	
	}


	public List<User> getAllUsers() {
		return jdbcTemplate.query(UserQueryConstants.GETALL, new UserMapper());
	}


	public User getUserById(String userId, String userPassword) {
		return jdbcTemplate.queryForObject(UserQueryConstants.GETBYID, new Object[] { userId, userPassword },
				new UserMapper());
	}

}