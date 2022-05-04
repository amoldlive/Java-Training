package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample3 {
	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			
			//step -1  - register a driver --ClassNotFoundException
			//Class.forName("org.postgresql.Driver");  //java version 1.6 //optional
			
			//Step-2 Create Connection --SQLException
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			
			System.out.println("Connected to Database");
			//logic
				
			String SQL="insert into student_details values(1,'Rahul',1,2,'Nagpur');";
			System.out.println("SQL : "+SQL);
			
			//Step-3 -- create statement
			Statement stmt=con.createStatement(); 
			stmt.execute(SQL); // execuet the sql query

			System.out.println("Data Inserted Successfully");
			
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
