package com.java.oops;

class Addition{
	
	public void add(int a,int b) {
		System.out.println("integer : "+(a+b));
	}
	public void add(short a,short b) {
		System.out.println("short : "+(a+b));
	}
	public void add(byte a,byte b) {
		System.out.println("Byte : "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("3-integer : "+(a+b+c));
	}
	
	public void add(float a,float b) {
		System.out.println("Float : "+(a+b));
	}
	
	public void add(long a,long b) {
		System.out.println("Long : "+(a+b));
	}
	
	
}

public class MethodOverloadingExample {
	public static void main(String[] args) {
		
		Addition addition=new Addition();
		addition.add(10, 20);
		addition.add(10, 20,30);
		addition.add(10.20F, 20.20F);
		addition.add(10L, 20L);
		
	}
}
