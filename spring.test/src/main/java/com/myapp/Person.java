package com.myapp;

public class Person {
	int id;
	String name;
	int age;
	boolean alive;

	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Person(int id, String name, int age, boolean alive) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", alive=" + alive + "]";
	}

	

	

}
