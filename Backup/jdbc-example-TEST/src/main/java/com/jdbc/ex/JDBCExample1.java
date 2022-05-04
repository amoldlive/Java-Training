package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample1 {
	public static void main(String[] args) {
		Connection con=null;
		try {
			//Class.forName("org.postgresql.Driver");
			//optional from 1.6
			
			con = DriverManager
			            .getConnection("jdbc:postgresql://localhost:5432/MyDB",
			            "postgres", "postgres");
			
			Statement smnt=con.createStatement();

			String SQL="create table student_details(student_id INT PRIMARY KEY,student_name varchar(100),student_year INT,student_semister INT,student_address varchar(200));";
			smnt.execute(SQL); //table related operations
			System.out.println("Table Created Successfuly");
			
			System.out.println("Connected to DB Successfully");
			con.close();
		} catch (Exception e) {
			System.out.println("Exception while connecting to the DB : "+e);
		}

	}
}
