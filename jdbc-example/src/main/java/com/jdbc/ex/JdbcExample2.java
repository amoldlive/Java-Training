package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample2 {
	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			
			//step -1  - register a driver --ClassNotFoundException
			//Class.forName("org.postgresql.Driver");  //java version 1.6 //optional
			
			//Step-2 Create Connection --SQLException
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			
			System.out.println("Connected to Database");
			//logic
				
			String SQL="create table student_details"+ 
					"("+
							"student_id INT PRIMARY KEY," +
							"student_name varchar(100),"+
							"student_year INT,"+
							"student_semister INT,"+
							"student_address varchar(200)"+	
							");";
			
			System.out.println("SQL : "+SQL);
			
			//Step-3 -- create statement
			Statement stmt=con.createStatement(); 
			stmt.execute(SQL); // execuet the sql query
			
			System.out.println("Table Created Successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
