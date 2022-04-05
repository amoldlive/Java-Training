package com.java.basic;

public class LocalVariableExample {
	//instance
	int i=10;
	
	//static
	static int i2=11;
	
	public static void main(String[] args) {
			LocalVariableExample example=new LocalVariableExample();
			example.print();
			example.access();
			show();
	}
	
	public void print() {
		int i3=12; //local
		System.out.println(i3);
		System.out.println(i2);
	}
	public void access() {
		System.out.println(i);
	}
	public static void show() {
		System.out.println(i2);
	}
}
