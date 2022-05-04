package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample6 {
	public static void main(String[] args) {
		Connection con=null;
		try {
			//Class.forName("org.postgresql.Driver");
			//optional from 1.6
			
			con = DriverManager
			            .getConnection("jdbc:postgresql://localhost:5432/MyDB",
			            "postgres", "postgres");
			System.out.println("Connected to DB Successfully");

			Statement smnt=con.createStatement();

			String SQL="select  * from student_details;";
			
			//select operation
			ResultSet resultSet=smnt.executeQuery(SQL);
			while(resultSet.next()) {
				int student_id=resultSet.getInt("student_id");
				String student_name=resultSet.getString("student_name");
				int student_year=resultSet.getInt("student_year");
				int student_semister=resultSet.getInt("student_semister");
				String student_address=resultSet.getString("student_address");
				
				System.out.println(student_id +" "+student_name +" "+ student_year+" "+student_semister+" "+student_address);
			}

			con.close();
		} catch (Exception e) {
			System.out.println("Exception while connecting to the DB : "+e);
		}

	}
}
