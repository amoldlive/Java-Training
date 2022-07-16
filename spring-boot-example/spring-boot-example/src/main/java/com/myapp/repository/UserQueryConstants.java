package com.myapp.repository;

public class UserQueryConstants {
	static final String INSERT = "INSERT INTO user_details(userno, userid, userpassword, dob, gender, address, city, state, usercreationdate)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
	static final String GETALL = "select * from user_details";
	static final String GETBYID = "select * from user_details where userid=? and userpassword=?";

}
