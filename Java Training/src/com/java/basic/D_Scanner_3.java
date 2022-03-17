package com.java.basic;

import java.util.Scanner;

public class D_Scanner_3 {
	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
		
			System.out.println("Enter Name");
			String name = scanner.next();
			
			scanner.skip("\r\n");
			//scanner.nextLine();
			//keep nextLine data at starting
			
			System.out.println("Enter Address");
			String address = scanner.nextLine();
			
			System.out.println("Enter age");
			int age=scanner.nextInt();
			
			System.out.println("name : "+name +" | Address : "+address+"  | age  : "+age );
			
	}
}
