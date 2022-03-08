package com.java.basic;

public class H_NestedForLoop_3 {
	public static void main(String[] args) {
		
		/*  */
		
		for (int row = 1; row<=5; row++) {
			
			for(int col2=5;col2>=row;col2--) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
}


/*
sssss*
ssss**
sss***
ss****
s*****  

*/

