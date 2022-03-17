package com.java.oops;

class Shape {

	public Shape(){
		System.out.println("Shape object created");
	}
	
	String shapeName;

	public void setShapeName(String name) {
		shapeName = name;
	}

	public void printShapeName() {
		System.out.println("Shape Name : " + shapeName);
	}
}
class Round extends Shape{
	public Round() {
		System.out.println("Round Object Created");
	}
}
class Circle extends Round{
	public Circle() {
		System.out.println("Circle object created");
	}
	
}


public class InheritanceExample {
	public static void main(String[] args) {
				
		Circle circle=new Circle();
		circle.setShapeName("circle");
		circle.printShapeName();
		
		
		
	}
}
