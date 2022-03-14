package com.java.arr;

import java.util.Arrays;

/*Arrays Class*/
public class ArrayExample7 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {101,45,11,21,31,81,91,51}; //unsorted Array
		int searchElement=31;
		
		print(elementArr); // print
		
	
		
		Arrays.sort(elementArr);
		
		print(elementArr);
				
		int location=Arrays.binarySearch(elementArr, searchElement);
		
		System.out.println("Element : "+searchElement +" |  Location of element : "+location);
	
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	
}
