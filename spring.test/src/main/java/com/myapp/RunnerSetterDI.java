package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerSetterDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person) context.getBean("personBean");
		System.out.println(person);
	}
}
