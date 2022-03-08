package com.java.basic;

public class E_SwitchCase {

	public static void main(String[] args) {
		
		/* 1..10 */
		// 1..10   : print number in words
	
		int data=5;
		
		switch (data) {
		case 1:
			System.out.println("one");
			break; //optional
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
		
		System.out.println("End of the programme");
		
	}
	
}
