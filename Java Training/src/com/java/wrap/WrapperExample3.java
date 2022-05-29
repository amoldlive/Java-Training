package com.java.wrap;

public class WrapperExample3 {
	public static void main(String[] args) {
		
		//primitive to object
		int i=10;
		Integer intObj=Integer.valueOf(i);
		
		//object to primitive
		Integer intObj2=Integer.valueOf(20);
		int i2=intObj2.intValue();
		
		short s=10;
		Short shortObj=Short.valueOf(s);
		short s2=shortObj.shortValue();
		
		Boolean bObj=Boolean.valueOf(false);
		boolean b=bObj.booleanValue();
		
		Character charObj=new Character('A');
		char c=charObj.charValue();
	}
}
