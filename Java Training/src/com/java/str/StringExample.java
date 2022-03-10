package com.java.str;

public class StringExample {

	// by literal
	String str = "Hello World";

	// by new keyword
	String str2 = new String("Hello World");

	public static void main(String[] args) {
		StringExample stringExample = new StringExample();
		stringExample.testStringMethods();
	}

	public void testStringMethods() {
		System.out.println("Raw Data : "+str);
		// charAt
		char ch = str.charAt(1);
		System.out.println("CharAt : " + ch);

		
		// length
		int length = str.length();
		System.out.println("length : " + length);
		
		// substring
		String subStr = str.substring(2);
		System.out.println("substring : " + subStr);

		
		// substring-2
		String subStr2 = str.substring(2, 5);
		System.out.println("substring : " + subStr2);

		
		// contains
		boolean isContains = str.contains("Hello");
		System.out.println("isContains : " + isContains);

		
		// equals
		boolean isEquals = str.equals("Hello World");
		System.out.println("isEquals : " + isEquals);

		
		// eualsignorecase
		boolean isEqualsIgnoreCase = str.equalsIgnoreCase("heLLO worlD");
		System.out.println("isEqualsIgnoreCase : " + isEqualsIgnoreCase);

		
		// empty
		boolean isEmpty = str.isEmpty();
		System.out.println("isEmpty : " + isEmpty);
		/*
		// concat
		String newStr = str.concat("Softronix");
		System.out.println("concat : " + newStr);

		// replace
		String newStr2 = str.replace('H', 'T');
		System.out.println("replace : " + newStr2);

		// replace
		String newStr3 = str.replace("Hello", "Hey");
		System.out.println("replace : " + newStr3);

		// tolowercase
		String newStr4 = str.toLowerCase();
		System.out.println("toLowerCase : " + newStr4);

		// uppercase
		String newStr5 = str.toUpperCase();
		System.out.println("toUpperCase : " + newStr5);

		// indexOf
		int index = str.indexOf('H');
		System.out.println("indexOf : " + index);

		// Trim
		String trimmedStr = str.trim();
		System.out.println("trim : " + trimmedStr);

		// valueOf
		String valueOf = str.valueOf(true);
		System.out.println("valueOf : " + valueOf);

		// split
		String[] newStr6 = str.split(" ");
		System.out.println("newStr6 : " + newStr6);
	*/
	}

}
