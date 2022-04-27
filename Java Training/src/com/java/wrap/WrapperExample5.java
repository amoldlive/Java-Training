package com.java.wrap;

public class WrapperExample5 {
	public static void main(String[] args) {
		
		//Object to String
		Integer i=10;
		String iStr=Integer.toString(i);
		System.out.println("String [i-object] : "+iStr);
		System.out.println("String [i-object] length : "+iStr.length());
		
		
		//String to Object
		String str="100";
		Integer iVal=Integer.valueOf(str);
		System.out.println("integer-Object value : "+iVal);
		
		Long lVal=Long.valueOf(str);
		System.out.println("long-Object value : "+lVal);
		
		Float fVal=Float.valueOf(str);
		System.out.println("Float-object value : "+fVal);

	}
}
