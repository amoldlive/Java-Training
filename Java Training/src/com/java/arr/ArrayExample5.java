package com.java.arr;

/*Copy Array Elements into another array*/
public class ArrayExample5 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {1,0,9,6,0,4,0,2,0,0,5};
		
		
		print(elementArr);
		
		int[] freshCopy=copyArray(elementArr);
		
		print(freshCopy);
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int[] copyArray(int arr[]) {
		int freshArr[]=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			freshArr[i]=arr[i];
		}
		return freshArr;
	}
	
	
}
