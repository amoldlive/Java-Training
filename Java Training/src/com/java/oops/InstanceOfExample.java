package com.java.oops;

class Animal{
	
	public void eat() {
		System.out.println("Eating ********");
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class InstanceOfExample {
	public static void main(String[] args) {
			
		String name="Rahul";
		
		boolean result=name instanceof String; 
		System.out.println("Result : "+result);
		
		Dog dogObject=new Dog();
		dogObject.eat();
		
		boolean result2=dogObject instanceof Dog;
		System.out.println("result2 : "+result2);
		
		boolean result3=dogObject instanceof Animal;
		System.out.println("result3 : "+result3);
		
	}

}
