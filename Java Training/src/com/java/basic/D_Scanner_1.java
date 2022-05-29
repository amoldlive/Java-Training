package com.java.basic;

import java.util.Scanner;

public class D_Scanner_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// take name as input from user
		System.out.println("Enter you Full name : ");
		//String name = scanner.next();
		String name = scanner.nextLine();

		//System.out.println("Enter you Age : ");
		//int age = scanner.nextInt();

		System.out.println("Name : "+name);
		//System.out.println("Age : " + age);

	}
}
