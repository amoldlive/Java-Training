package com.myapp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Employee employee = context.getBean(Employee.class);
		employee.setId(1);
		employee.setName("Rohan");
		employee.setCompany("Softronix");
		employee.setSalary(2000.110f);
		
		System.out.println(employee);
		
		MyCompanyService myCompanyService = context.getBean(MyCompanyService.class);
		myCompanyService.displayEmployeeData();
	}	
	
}
