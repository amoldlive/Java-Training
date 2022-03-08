package com.java.basic;

public class ConstructorExample {
	
	public static void main(String[] args) {
			Bike bike=new Bike();
			bike.setName("Yamaha R1");
			bike.setColor("Black");
			bike.printBikeDetails();
			
			System.out.println("-----------------------------");
			
			Bike bike2=new Bike("RE classic", "Grey");
			bike2.printBikeDetails();
			
			System.out.println("-----------------------------");
			
			Bike bike3=new Bike("RED");
			bike3.printBikeDetails();
	}
	
	
}
class Bike{
	
	String baseBikeName;
	String color;
	
	//default
	Bike(){
		baseBikeName="Honda";
		color="white";
		System.out.println("Bike is created");
		
	}
	
	//parameterize
	Bike(String bikeName,String bikeColor){
		System.out.println("Parameterized constructor >> Bike is created");
		baseBikeName=bikeName;
		color=bikeColor;
		
	}
	
	//parameterize
		Bike(String bikeColor){
			System.out.println("Parameterized constructor >> Bike is created");
			baseBikeName="RE CLASSIC";
			color=bikeColor;
			
		}
	
	public void printBikeDetails() {
		
		System.out.println("Bike Name : "+baseBikeName);
		System.out.println("Bike Color : "+color);
	}
	
	public void setName(String bikeName) {
		baseBikeName=bikeName;
	}
	
	public void setColor(String bikeColor) {
		color=bikeColor;
	}
	
}