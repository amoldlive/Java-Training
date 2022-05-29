package com.java.arr;

/*Find Sum oF Array Elements */
public class ArrayExample4 {

	public static void main(String[] args) {
			
		int elementArr[]= {1,0,9,6,0,4,0,2,0,0,5};
		
		print(elementArr);
		
		int sum=findSum(elementArr);
		
		System.out.println("Sum of Element : "+sum);
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int findSum(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	
}
