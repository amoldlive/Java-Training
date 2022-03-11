package com.java.arr;

public class ArrayExample2 {
	
	static int[] val= {10,11,12,13};
	
	static int[] val2= {101,102,103};
	static int[] val3= {1111,2222,3333,4444};
	
	
	public static void main(String[] args) {
		ArrayExample2 arrayExample=new ArrayExample2();
		arrayExample.print(val);
		System.out.println("Array 2 ************");
		arrayExample.print(val2);
		System.out.println("Array 3 ************");
		arrayExample.print(val3);
		
		
	}
	public void print(int[] data) {
		//some logic
		int length=data.length; //array length
		
		for(int index=0 ; index<length ; index++) {
			System.out.println(data[index]);
		}
		
	}
	
	
}
