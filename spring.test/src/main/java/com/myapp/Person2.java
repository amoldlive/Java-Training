package com.myapp;

public class Person2 {
	int id;
	String name;
	int age;
	boolean alive;

	public Person2(int id, String name, int age, boolean alive) {
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
