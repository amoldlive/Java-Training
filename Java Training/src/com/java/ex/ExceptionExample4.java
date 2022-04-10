package com.java.ex;

public class ExceptionExample4 {
	public static void main(String[] args) {
		System.out.println("START******");
		printArray();
		System.out.println("END******");
	}

	public static void printArray() {
		int arr[] = { 1, 2, 3, 4, 5 };
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nAccesing Invalid Array Index Location");
		}finally {
			System.out.println("Hi I AM Finally ** ");
		}
		
		System.out.println();
	}

}
