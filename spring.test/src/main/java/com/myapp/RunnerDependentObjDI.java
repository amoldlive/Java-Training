package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerDependentObjDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person3 person3 = (Person3) context.getBean("personeBean3");
		System.out.println(person3);
		person3.show();
		

	}
}
