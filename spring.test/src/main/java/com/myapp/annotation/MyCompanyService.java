package com.myapp.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCompanyService {
	
	@Autowired
	Employee employee;
	
	public void displayEmployeeData() {
		System.out.println(employee);
	}
}
