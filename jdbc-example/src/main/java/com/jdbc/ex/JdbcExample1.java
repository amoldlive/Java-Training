package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample1 {
	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			
			//step -1  - register a driver --ClassNotFoundException
			//Class.forName("org.postgresql.Driver");  //java version 1.6 //optional
			
			//Step-2 Create Connection --SQLException
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			
			System.out.println("Connected to Database");
			//logic
				
			
			
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
