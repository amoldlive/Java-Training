package com.java.ex;

public class ExceptionExample5 {
	public static void main(String[] args) {
		System.out.println("START******");
		try {
			m3();
		} catch (Exception e) {
			System.out.println("Exception while calling m3() method");
		}
		System.out.println("END******");
	}

	public static void m3() throws ArrayIndexOutOfBoundsException, Exception {
		m2();
	}

	public static void m2() throws ArrayIndexOutOfBoundsException, Exception {
		m1();
	}

	public static void m1() throws ArrayIndexOutOfBoundsException, Exception {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
