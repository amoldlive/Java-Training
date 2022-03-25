package com.java.keyword;

class Flower {

	String flowerName;
	
	public Flower(String flowerName) {
		this.flowerName = flowerName;
	}

	private void printData(Flower flower) {
		System.out.println("Updated FlowerName : " + flower.flowerName);
	}

	public void print() {
		printData(this);
	}
}

public class ThisMethodParamExample {
	public static void main(String[] args) {
		Flower flower = new Flower("Sunflower");
		flower.print();
	}
}
