package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RunnerApplicationContextExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ApplicationContext context2 = new FileSystemXmlApplicationContext("c://sjdhjs/applicationContext.xml");

		
		Student student = (Student) context.getBean("studentbean");
		student.displayInfo();
	}
}
