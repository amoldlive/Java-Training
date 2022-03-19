package com.java.oops;

class Sample {
	
	//private variable
	private int i=20;
	
	
	//private
	private void showI() {
		System.out.println(" I : "+i);
	}
	
	//private
	private Sample(int i) {
		
	}
	
	//public
	public void show() {
		showI();
	}
	
	//static method
	public static void showData(int num1,int num2) {
		System.out.println("Static Data Here Addition : "+(num1+num2));
	}
	
}//end point
public class PrivateModifierExample {
	public static void main(String[] args) {
		
		//Sample sample=new Sample(10);
		
		//System.out.println(sample.i);
		
		//sample.showI();
		
		//sample.show();
		
		Sample.showData(10, 20);
		//showData(10, 20);
	}
	
	public static void showData(int num1,int num2) {
		System.out.println("Static Data Here Addition : "+(num1+num2));
	}
	
}
