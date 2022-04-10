package com.java.ex;

public class ExceptionExample3 {
	public static void main(String[] args) {

		System.out.println("START***********");
		String name = "AKASH";
		int i = 0;
		try {

			try {
				i = 10 / 0;

			} catch (ArithmeticException e) {
				System.out.println("number Can not be divided by 0 ** ");
			}

			
			
			try {
				i = 10 / 0;

			} catch (ArithmeticException e) {
				System.out.println("number Can not be divided by 0 ** ");
			}

			System.out.println(i);
				
			System.out.println(name.length());

		} catch (NullPointerException e) {
			
			System.out.println("name is null");
			
			
			
			
		} catch (ArithmeticException e) {
			System.out.println("Number Can not be divided by 0");
		} catch (Exception e) {
			System.out.println("Default : " + e);
		}

		System.out.println("END************");

	}
}
