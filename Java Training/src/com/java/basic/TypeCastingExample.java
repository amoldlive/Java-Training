package com.java.basic;

public class TypeCastingExample {
	public static void main(String[] args) {
		
		//widening
		byte b=10;
		System.out.println("byte - "+b);
		int i=b;
		long l=b;
		float f=b;
		double d=b;
		System.out.println("int - "+i);
		System.out.println("long - "+l);
		System.out.println("float - "+f);
		System.out.println("double - "+d);

		char c='A';
		int ic=c;
		System.out.println("Char Integer : "+ic);
		
		
		//narrowing
		double d2=123.45d;
		System.out.println("Double d2 - "+d2);
		float f2=(float) d2;
		int i2=(int) d2;
		long l2=(long) d2;
		char c2=(char) d2;
		
		System.out.println("float f2 - "+f2);
		System.out.println("int i2 - "+i2);
		System.out.println("long l2 - "+l2);
		System.out.println("Char c2 - "+c2);
		
		
		
		int i3=43;
		boolean status=true;
		
		String str=String.valueOf(i3);
		String str2=String.valueOf(status);
		
		
		System.out.println("Age "+str);
		System.out.println("Boolean "+status);
	}
}
