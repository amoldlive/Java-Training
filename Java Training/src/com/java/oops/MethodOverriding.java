package com.java.oops;

class Vehical{
	
	public void run() {
		System.out.println("Vehical is running");
	}
	
}

class Bike extends Vehical{
	
	public void run() {
		System.out.println("Bike is running");
	}
	
}
public class MethodOverriding {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.run();
	}
}
