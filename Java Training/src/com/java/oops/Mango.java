package com.java.oops;

//super class
class Fruit{
	String name; //state
	//String color;
	//String season;

	//behaviours
	public void setFruitName(String fruitName) {
		name=fruitName;
	}
	
	public String getFruitName() {
		return name;
	}
}
//sub class -1
class Apple extends Fruit{
	//properties of fruit
	
	String taste="Sweet";
	
	public void printTaste() {
		System.out.println("Apple : "+taste);
	}
}

//sub class of Apple
class GreenApple extends Apple{
	
	
}

//sub class -2
public class Mango extends Fruit {
	
	public static void main(String[] args) {
		
		//Fruit class object
		//Fruit fruitObject=new Fruit();
		//fruitObject.setFruitName("Mango");
		//System.out.println(fruitObject.getFruitName());
	
		
		
		Mango mangoObject=new Mango();
		mangoObject.setFruitName("Mango");
		System.out.println(mangoObject.getFruitName());
		
		
		
		Apple appleObject=new Apple();
		appleObject.setFruitName("Apple");
		System.out.println("Fruit Name : "+appleObject.getFruitName());
		appleObject.printTaste();
		
		
		GreenApple greenAppleObject=new GreenApple();
		greenAppleObject.setFruitName("Green Apple"); //fruit class
		System.out.println("Fruit Name : "+greenAppleObject.getFruitName()); //fruit class
		greenAppleObject.printTaste();
	}
	
}
