package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerCollectionDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person4 person1 = (Person4) context.getBean("personBean4");
		System.out.println(person1);
		
		
		Person4 person2 = (Person4) context.getBean("personBean5");
		System.out.println(person2);
	}
}
