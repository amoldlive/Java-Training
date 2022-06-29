package com.myapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.myapp.model.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		User user = new User();
		user.setUserno(resultSet.getString("userno"));
		user.setUserid(resultSet.getString("userid"));
		user.setUserpassword(resultSet.getString("userpassword"));

		user.setDob(resultSet.getString("dob"));
		user.setGender(resultSet.getString("gender"));
		user.setAddress(resultSet.getString("address"));
		user.setCity(resultSet.getString("city"));
		user.setState(resultSet.getString("state"));

		user.setUsercreationdate(resultSet.getString("usercreationdate"));
		return user;
	}

}