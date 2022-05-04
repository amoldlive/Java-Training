package com.jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample7 {
	public static void main(String[] args) {
		Connection con=null;
		try {
		
			con = DriverManager
			            .getConnection("jdbc:postgresql://localhost:5432/MyDB",
			            "postgres", "postgres");
			System.out.println("Connected to DB Successfully");
			
			
			Statement smnt=con.createStatement();
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Please Enter Details for Student ");
			
			System.out.println("Enter Student Id : ");
			int id=scanner.nextInt();
			
			scanner.nextLine();
			System.out.println("Enter Student Name : ");
			String name=scanner.nextLine();
			
			System.out.println("Enter Student Year : ");
			int year=scanner.nextInt();
			
			System.out.println("Enter Student Sem : ");
			int sem=scanner.nextInt();
			
			scanner.nextLine();
			System.out.println("Enter Student Address : ");
			String address=scanner.nextLine();
			
			String SQL="insert into student_details values("+id+",'"+name+"',"+year+","+sem+",'"+address+"');";
			
			int row=smnt.executeUpdate(SQL);
			System.out.println("Data inserted into table successfully : "+row);
			
						con.close();
		} catch (Exception e) {
			System.out.println("Exception while connecting to the DB : "+e);
		}

	}
}
