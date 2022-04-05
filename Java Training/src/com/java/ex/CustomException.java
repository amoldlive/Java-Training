package com.java.ex;

class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
	}
	
}
public class CustomException {
	public static void main(String[] args) {
		
		CustomException customException=new CustomException();
		
		try {
			customException.validateAge(17);
		} catch (InvalidAgeException e) {
			//e.printStackTrace();
			System.out.println("invalid Age for vote");
		}
		
	}
	public void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("invalid Age for VOTE");
		}else {
			System.out.println("Welcome to VOTE");
		}	
	}
}
