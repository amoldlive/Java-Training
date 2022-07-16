package com.myapp.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.model.User;

@Repository
public class MyAppRepositoryImpl implements MyAppRepositoryInterface {

	JdbcTemplate jdbcTemplate;

	public MyAppRepositoryImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean saveUser(User user) {
		jdbcTemplate.update(UserQueryConstants.INSERT, user.getUserno(), user.getUserid(), user.getUserpassword(),
				user.getDob(),user.getGender(), user.getAddress(), user.getCity(), user.getState(), user.getUsercreationdate());
		System.out.println("User Saved into DB  : " + user.getUserid());
		return true;
	}

	@Override
	public List<User> getAllUsers() {
		return jdbcTemplate.query(UserQueryConstants.GETALL, new UserMapper());
	}

	@Override
	public User getUserById(String userId, String userPassword) {
		return jdbcTemplate.queryForObject(UserQueryConstants.GETBYID, new Object[] { userId, userPassword },
				new UserMapper());
	}

}