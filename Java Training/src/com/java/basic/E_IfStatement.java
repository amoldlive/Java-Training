package com.java.basic;

public class E_IfStatement {
/*
Simple if statement
if-else statement
Nested if-statement
if-else-if
 */
	
		public static void main(String[] args) {
			
			int num1=5;
			int num2=12;
			
			//find num1 is max number  
			if(num1>num2) {
				System.out.println("Simple If - Max Number "+num1);
			}
			
			// find max number
			if(num1>num2) {
				System.out.println("if-else  Max Number : "+num1);
			}else {
				System.out.println("if-else [else block] Max Number : "+num2);
			}
			
			
			//nested if
			//num +ve  // num <100 // num increment by 1
			
			int num3=102;
			
			if(num3>0) {
				
				if(num3<100) {
					num3=num3+1;	
					System.out.println("num3 : "+num3);
				}else {
					System.out.println("number is greater than 100");
				}
				
			}else {
				System.out.println("Number is negative");
			}
			
			
			System.out.println("End ********** ");
			
		}
	
}
