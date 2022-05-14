package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcExample4 {
	public static void main(String[] args) {
		Connection con = null;

		ArrayList<String> list = new ArrayList<String>();
		list.add("insert into student_details values(2,'Snjay Pande',3,1,'Hyderabad');");
		list.add("insert into student_details values(3,'Dipak Sharma',1,2,'Nagpur');");
		list.add("insert into student_details values(4,'Sarang Varma',3,2,'Hyderabad');");
		list.add("insert into student_details values(5,'Rohan Kapoor',4,1,'Nagpur');");

		try {

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			System.out.println("Connected to database");

			Statement smnt = con.createStatement();

			for (int i = 0; i < list.size(); i++) {
				int row = smnt.executeUpdate(list.get(i));
				System.out.println("Data inserted into table successfully : " + row);
			}

		} catch (SQLException e) {
			System.out.println("Exception while connecting to the database " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Exception while closing resources " + e);
			}
		}
	}
}
