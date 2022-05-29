package com.java.ex;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}

}

public class VoteSystem {
	public static void main(String[] args) {

		int age = 14;
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		

	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid Age for VOTE");
		} else {
			System.out.println("Welcome to VOTE");
		}
	}
}
