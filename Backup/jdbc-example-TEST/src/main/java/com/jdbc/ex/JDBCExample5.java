package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample5 {
	public static void main(String[] args) {
		Connection con=null;
		try {
			//Class.forName("org.postgresql.Driver");
			//optional from 1.6
			
			con = DriverManager
			            .getConnection("jdbc:postgresql://localhost:5432/MyDB",
			            "postgres", "postgres");
			
			Statement smnt=con.createStatement();

			String SQL="update student_details set student_name='Rahul Bhutt' where student_id=1;";
			
			int row=smnt.executeUpdate(SQL);
			System.out.println("Data Updated successfully : "+row);
			
			System.out.println("Connected to DB Successfully");
			con.close();
		} catch (Exception e) {
			System.out.println("Exception while connecting to the DB : "+e);
		}

	}
}
