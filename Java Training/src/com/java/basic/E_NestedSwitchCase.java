package com.java.basic;

/*print subjects as per semister of the year */
//1st year 1st sem -- C , Maths,HTML
//1st year 2nd sem -- C++ , ED

//2nd year 1st sem -- java , Database
//2nd year 2nd sem -- Python , Android

public class E_NestedSwitchCase {
	public static void main(String[] args) {

		// take input from user
		int year = 2;
		int semister = 1;

		switch (year) {
		case 1:
			System.out.println("1st year");
			switch (semister) {
			case 1:
					System.out.println("  1st Semister  subjects : c , maths ,html");
				break;
			case 2:
				System.out.println("  2nd Semister  subjects : c++ , ED");
				break;
			default:
				System.out.println("invalid semister");
				break;
			}
			
			break;
		case 2:
			System.out.println("2nd year");
			switch (semister) {
			case 1:
				System.out.println("  1st Semister  subjects : java , Database");
				break;
			case 2:
				System.out.println("  2nd Semister  subjects : python , android");
				break;
			default:
				System.out.println("invalid semister");
				break;
			}
			break;
		case 3:
			System.out.println("3rd year");
			break;
		case 4:
			System.out.println("4th year");
			break;
		default:
			System.out.println("invalid year");
			break;
		}

	}
}
