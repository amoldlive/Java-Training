package com.java.ex;

public class ExceptionExample6 {
	public static void main(String[] args) throws Exception {
		System.out.println("START******");
		
		m1(100, 0);
		
		System.out.println("END******");
	}

	public static void m1(int a, int b) throws Exception  {
		if(b==0) {
			throw new Exception("value of b can not be 0");
		}
		int c=a/b;
		System.out.println("Result : "+c);
	}

}
