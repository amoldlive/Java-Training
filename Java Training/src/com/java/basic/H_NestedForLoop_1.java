package com.java.basic;

public class H_NestedForLoop_1 {
	public static void main(String[] args) {
		
		/* Book a hotel for 3 weeks , 1 week = 7 days */
		
		
		int weeks=3;
		int days=7;
		
		for(int val=1;val<=weeks;val++) {
			System.out.println("Week - "+val);
			
			for(int val2=1;val2<=days;val2++) {
				System.out.println("  Day : "+val2+"   booked ");
			}
		}
		
	}
}
