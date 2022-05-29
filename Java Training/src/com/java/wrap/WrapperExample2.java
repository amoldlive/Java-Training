package com.java.wrap;

public class WrapperExample2 {
	public static void main(String[] args) {
		
		byte b = 10; //primitive
		Byte byteObj3=b; 
		//primitive to object
		//no method used
		//internally by java 
		//Automatic conversion
		//Autoboxing --> conversion of primitive into wrapper
		System.out.println("Byte : "+byteObj3);
		
		short s=100;
		Short sObj=s;
		System.out.println("Short : "+sObj); //Autoboxing
	
	
		//Autounboxing
		//conversion of Object into primitive
		Integer intObj=Integer.valueOf(200);
		int i1=intObj.intValue(); //object to premitive
		
		//OR
		
		int i2=intObj; //Automatic/Internally by java
		System.out.println("Premitive : "+i2);
	}
}
