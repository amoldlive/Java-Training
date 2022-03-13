package com.java.arr;

/*count the number of elements from array  if default value is present ignore it while counting */
public class ArrayExample3 {

	public static void main(String[] args) {
			
		int elementArr[]= {1,0,9,6,0,4,0,2,0,0,5};
		print(elementArr);
		int count=countElements(elementArr);
		System.out.println("Element COunt : "+count);
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int countElements(int arr[]) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		return count;
	}
	
	
}
