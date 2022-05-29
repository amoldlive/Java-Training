package com.java.keyword;

class Fruit{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("Printing Name : "+this.getName());
	}
	
	public Fruit getFruit() {
		return this;
	}
}
public class ThisVariableExample {
	public static void main(String[]args) {
		Fruit fruit=new Fruit();
		fruit.setName("Apple");
		System.out.println(fruit.getName());
		
		fruit.print();
		
		Fruit fruit1=new Fruit();
		fruit1.setName("Orange");
		System.out.println("Fruit 1 : "+fruit1.getName());
		
		Fruit fruit2=fruit1.getFruit();
		System.out.println("Fruit 2 : "+fruit2.getName());
	}
}
