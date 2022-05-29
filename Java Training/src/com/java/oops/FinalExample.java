package com.java.oops;

final class Gallary{
	
	final public String password="ABC";
	
	/*
	public void changePassword() {
		password="CDE";
	}
	*/
	
	final public void printPassword() {
		System.out.println("Password : "+password);
	}
	
}
class MyGallary{
	
	/*
	public void printPassword() {
		System.out.println("MyGallary Password : XYZ ");
	};
	*/
}

public class FinalExample {
	public static void main(String[] args) {
		Gallary gallary=new Gallary();
		gallary.printPassword();
		//gallary.changePassword();
		gallary.printPassword();
		
		MyGallary myGallary=new MyGallary();
		//myGallary.printPassword();
		
	}
}
