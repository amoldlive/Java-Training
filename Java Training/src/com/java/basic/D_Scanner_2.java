package com.java.basic;

import java.util.Scanner;

//import java.util.Scanner;

public class D_Scanner_2 {
	public static void main(String[] args) {

		// + operator overloded
			
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter Fname");
		String fName=scanner.next();
		
		//System.out.println("Enter Lname");
		//String lName=scanner.next();		
		
		//System.out.println("Enter Age");
		//int age=scanner.nextInt();

		//System.out.println("Enter Phone Number");
		//long phoneNumber=scanner.nextLong();

		//System.out.println("Enter CGPA");
		//double cgpa=scanner.nextDouble();
		
		//scanner.skip("\r\n");
		//scanner.nextLine();
		System.out.println("Enter Address");
		String address=scanner.nextLine();

		
		System.out.println("First Name : "+fName);
		//System.out.println("Last Name : "+lName);
		//System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		//System.out.println("Phone Number : "+phoneNumber);
		//System.out.println("CGPA : "+cgpa);
		
	
	}
}
