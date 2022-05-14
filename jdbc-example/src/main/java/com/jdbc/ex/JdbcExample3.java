package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample3 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// Class.forName("org.postgresql.Driver");
			// optional from 1.6

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");

			Statement smnt = con.createStatement();

			String SQL = "insert into student_details values(1,'Rahul',1,2,'Nagpur');";

			int row = smnt.executeUpdate(SQL);
			System.out.println("Data inserted into table successfully : " + row);

			System.out.println("Connected to DB Successfully");
			con.close();
		} catch (Exception e) {
			System.out.println("Exception while connecting to the DB : " + e);
		}

	}
}
