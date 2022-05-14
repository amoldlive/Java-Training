package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample1 {
	public static void main(String[] args) {

		// step -1 - register a driver --ClassNotFoundException
		// Class.forName("org.postgresql.Driver"); //java version 1.6 //optional

		// Step-2 Create Connection --SQLException
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");

			// logic

		} catch (SQLException e) {
			System.out.println("Exception while connecting to the database " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Exception while closing resources " + e);
			}
		}

		System.out.println("Connected to Database");
		// logic

	}
}
