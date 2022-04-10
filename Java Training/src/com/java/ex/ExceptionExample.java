package com.java.ex;

public class ExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("START***********");
		String name="AKASH";
		try {
			
			int i=10/0;
			System.out.println(i);
		}catch (NullPointerException e) {
			System.out.println("name is null");
		}catch(ArithmeticException e) {
			System.out.println("Number Can not be divided by 0");
		}catch (Exception e) {
			System.out.println("Default : "+e);
		}
		
		try {
			System.out.println(name.length());
		}catch (NullPointerException e) {
			System.out.println(e);
		}	
		
		System.out.println("END************");
		
			
	}
}
