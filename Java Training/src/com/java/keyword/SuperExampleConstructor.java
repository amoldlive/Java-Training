package com.java.keyword;

class Person{
	String name;
	int age;
	String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void print() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
	
}
class Employee extends Person{
	
	int salary;
	
	public Employee(String name, int age, String address,int salary) {
		super(name, age, address);
		this.salary=salary;
	}
	
	public void print() {
		super.print();
		System.out.println("Salary : "+salary);
	}
}
public class SuperExampleConstructor {
	public static void main(String[] args) {
			Employee employee=new Employee("Shan", 30, "Nagpur", 50000);
			employee.print();
	}
}
