package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExample9 {
	public static void main(String[] args) {
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			System.out.println("Connected to DB Successfully");


			Scanner scanner = new Scanner(System.in);

			System.out.println("Please Enter Details for Student ");

			System.out.println("Enter Student Id : ");
			int studentId = scanner.nextInt();

			scanner.nextLine();
			System.out.println("Enter Student Name : ");
			String studentName = scanner.nextLine();

			System.out.println("Enter Student Year : ");
			int studentYear = scanner.nextInt();

			System.out.println("Enter Student Sem : ");
			int studentSem = scanner.nextInt();

			scanner.nextLine();
			System.out.println("Enter Student Address : ");
			String studentAddress = scanner.nextLine();

			String SQL = "insert into student_details values(?,?,?,?,?);";

			System.out.println("SQL : "+SQL);
			PreparedStatement pStmnt = con.prepareStatement(SQL);
			pStmnt.setInt(1, studentId);
			pStmnt.setString(2, studentName);
			pStmnt.setInt(3, studentYear);
			pStmnt.setInt(4, studentSem);
			pStmnt.setString(5, studentAddress);
			
			int row = pStmnt.executeUpdate();
			System.out.println("Data inserted into table successfully : impacted rows -> " + row);

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
