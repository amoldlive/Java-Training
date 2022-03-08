package com.java.basic;

public class B_DataType {

	/*
	 * Premitive - boolean, char, byte, short, int, long, float and double.
	 *
	 * Non Premitive [User defined] - String
	 * 
	 * Default size
	 */
	boolean iAmBoolean=true; //false   [true  - false]  1 bit
	
	byte iAmByte=10; //0	[-127   -   +128]  1 byte
	short iAmShort=100; //0 2 byte  
	int iAmInt=1000; //0		4 byte
	long iAmLong=10000L; //0L	8 byte	
	
	float iAmFloat=3.14f; //0.0f	4 byte	 
	double iAmDouble=1234.14; //0.0  8 byte

	char iAmChar='A'; //[ ]  2 byte [in java] [Unicode] ['\u0041'] ['\u0000' - '\uFFFF' ]
	char iAmChar2=65;
	char iAmChar3='\u0041';
	
	
	// non premitive
	String iAmString="Hello"; //null

	public static void main(String[] args) {
		
		
		B_DataType b_DataType = new B_DataType();

		// Default Value | Assigned Value
		System.out.println(b_DataType.iAmBoolean);
		System.out.println(b_DataType.iAmByte);
		System.out.println(b_DataType.iAmShort);
		System.out.println(b_DataType.iAmInt);
		System.out.println(b_DataType.iAmLong);
		System.out.println(b_DataType.iAmFloat);
		System.out.println(b_DataType.iAmDouble);
		System.out.println(b_DataType.iAmString);
		System.out.println(b_DataType.iAmChar3);

		//System.out.println("END ********");
	}

	
	//boolean[data type] iAmBoolean[variable name] = true[value];
	
	// choose your data type wisely
	
	// Ascii vs Unicode
}
