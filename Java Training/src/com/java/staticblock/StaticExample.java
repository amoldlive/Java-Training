package com.java.staticblock;

public class StaticExample {

	//instance variable
	String color="RED";
	static String staticColor="BLACK";
	
	public static void main(String[] args) {
		StaticExample object=new StaticExample();
		object.printColor2();
	
		//System.out.println(color);
		
		System.out.println(staticColor);
		printStaticColor();
	}
	
	//instance method
	public void printColor() {
		System.out.println(color);
		System.out.println("Static variable : "+staticColor);
		
	}
	
	//instance method
	public void printColor2() {
		printColor();
		printStaticColor();
	}
	
	
	public static void printStaticColor() {
		System.out.println("Static Method : "+staticColor);
		
		//System.out.println("instance variable: "+color);
	}
	
	public static void printStaticColor2() {
		printStaticColor();
		
		//printColor();
	}
	
}
