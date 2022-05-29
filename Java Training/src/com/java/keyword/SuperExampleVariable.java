package com.java.keyword;

class Vehical {

	int maxSpeed = 120;

	public void printSpeed() {
		System.out.println("MaxSpeed-1 : "+maxSpeed );
	}
}

class Car extends Vehical {

	int maxSpeed = 180;
	

	public void printSpeed() {
		super.printSpeed();
		System.out.println("MaxSpeed-2 : " + super.maxSpeed);
	}

}

public class SuperExampleVariable {
	public static void main(String[] args) {
		Car car=new Car();
		car.printSpeed();
	}
}
