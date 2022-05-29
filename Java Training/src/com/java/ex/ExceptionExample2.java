package com.java.ex;

public class ExceptionExample2 {
	public static void main(String[] args) {
		System.out.println("START***********");
		ExceptionExample2 example = new ExceptionExample2();
		example.validateCode3();
		System.out.println("END-2************");
	}
	
	public void validateCode3() {
		try {
			validateCode2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void validateCode2() throws Exception{
		this.validateCode();
	}
	
	public void validateCode() throws Exception {
		
		String name = null;
		System.out.println(name.length());
		System.out.println("END-1************");
	}
}
