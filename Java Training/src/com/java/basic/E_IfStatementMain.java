package com.java.basic;

public class E_IfStatementMain {

	/* find the entered character is vowel or not */
	// A E I O U , a e i o u

	// ternary operator
	public static void main(String[] args) {

		VowelFinder vowelFinder = new VowelFinder('a');
		vowelFinder.find();

		// requirement -2
		VowelFinder vowelFinder2 = new VowelFinder();
		vowelFinder2.find('a'); // data to be passed through method
	}

}

class VowelFinder {

	//instance variable
	char inputChar;

	public VowelFinder() {

	}

	public VowelFinder(char enteredChar) {
		inputChar = enteredChar;
		
		
		
		//block
	}

	public void find() {
		if (inputChar == 'a') {
			System.out.println("It is a vowel");
		} else if (inputChar == 'e') {
			System.out.println("It is a vowel");

		} else {
			System.out.println("invalid Character");
		}
	}


	public void find(char enteredChar) {

		if (enteredChar == 'a') {
			System.out.println("It is a vowel");
		} else if (enteredChar == 'e') {
			System.out.println("It is a vowel");

		} else {
			System.out.println("invalid character");
		}

	}

}