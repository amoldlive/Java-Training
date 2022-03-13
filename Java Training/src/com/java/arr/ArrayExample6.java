package com.java.arr;

/*Search Element using linear search*/
public class ArrayExample6 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {11,31,41,102,51,61,71,81,91,101};
		int searchElement=11;
		
		print(elementArr);
		
		linearSearch(elementArr,searchElement);
	
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void linearSearch(int arr[] , int element) {
		int elementPosition ;		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==element) {
				System.out.println("Element Found At location : "+i);
				count++;
			}
		}
		if(count==0) {
			System.out.println("Element Not Fount");
		}
	}
	
	
}
