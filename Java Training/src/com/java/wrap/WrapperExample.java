package com.java.wrap;

public class WrapperExample {
	public static void main(String[] args) {
		
		byte b = 10; //primitive
		Byte byteObj1=new Byte(b); //object //way-1
		//OR
		Byte byteObj2=Byte.valueOf(b); //way-2
		//OR
		Byte byteObj3=b; //internally java will use valueOf method
		
		Byte byteObj4=10; // Byte.valueOf(10);
		System.out.println("Byte : "+byteObj3);
		
		short s = 11;
		Short shortObj=Short.valueOf(s);
		//OR
		Short shortObj2=s;
		System.out.println("Short : "+shortObj);
		
		int i = 12;
		Integer intObj=Integer.valueOf(i);
		System.out.println("Int : "+intObj);
		
		long l = 13L;
		Long objLong=Long.valueOf(l);
		System.out.println("Long : "+objLong);
		
		float f = 14.0F;
		Float objFloat=Float.valueOf(f);
		System.out.println("Float : "+objFloat);
		
		double d = 15;
		Double objDouble=Double.valueOf(d);
		System.out.println("Double : "+objDouble);
		
		char c = 'A';
		Character objCHar=Character.valueOf(c);
		System.out.println("CHar : "+objCHar);
		
		boolean isTrue = true;
		Boolean booleanObj=Boolean.valueOf(isTrue);
		System.out.println("boolean : "+booleanObj);
		
	}
}
