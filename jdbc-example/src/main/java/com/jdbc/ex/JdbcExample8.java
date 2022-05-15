package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample8 {
	public static void main(String[] args) {
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			System.out.println("Connected To Databased");

			String SQL = "insert into student_details values(?,?,?,?,?);";
			PreparedStatement pStmt = con.prepareStatement(SQL);
			pStmt.setInt(1, 102);
			pStmt.setString(2, "Shreya Upadhyay");
			pStmt.setInt(3, 2);
			pStmt.setInt(4, 1);
			pStmt.setString(5, "Delhi");

			int row = pStmt.executeUpdate();
			System.out.println("Data inserted into table successfully : rows impacted -> " + row);

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
