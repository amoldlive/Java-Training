package com.java.wrap;

public class WrapperExample4 {
	public static void main(String[] args) {
		
		//primitive to String
		int i=10; //premitive
		String iStr=Integer.toString(i);
		System.out.println("String [i] : "+iStr);
		System.out.println("String [i] length : "+iStr.length());
		System.out.println("String [i] 1st num : "+iStr.charAt(0));
		
		char ch='A';
		String cStr=Character.toString(ch);
		System.out.println("Character str : "+cStr.length());
		
		//String to primitive
		String str="100";
		int iVal=Integer.parseInt(str);
		System.out.println("integer value : "+iVal);
		
		long lVal=Long.parseLong(str);
		System.out.println("long value : "+lVal);
		
		float fVal=Float.parseFloat(str);
		System.out.println("Float value : "+fVal);

	}
}
