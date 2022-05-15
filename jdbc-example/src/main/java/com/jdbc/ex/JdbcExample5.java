package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample5 {
	public static void main(String[] args) {
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			System.out.println("Conencted to Database");
			
			Statement smnt = con.createStatement();

			String SQL = "update student_details set student_name='Rahul Bhutt' where student_id=1;";

			int row = smnt.executeUpdate(SQL);
			System.out.println("Data Updated successfully : impacted rows - > " + row);
			
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
