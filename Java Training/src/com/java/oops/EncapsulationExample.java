package com.java.oops;

class Car {
	private String name;
	private String color;
	private String modelNumber;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Updated Name : "+name);
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("CarName : "+name);
		System.out.println("Car color : "+color);
		System.out.println("Car model number : "+modelNumber);
		System.out.println("Car ID : "+id);
		
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.setName("Hyndai");
		car1.setColor("Black");
		car1.setModelNumber("A11021");
		car1.setId(1001);
		car1.print();
	}
}
