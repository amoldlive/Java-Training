package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/")
	public String sayHello() {
		return "i am here";
	}

	@GetMapping("/sayhello")
	public String sayHello2() {
		return "Hello World";
	}

	@GetMapping("/path/{name}")
	public String iAmPathVAriable(@PathVariable("name") String name) {
		return "My Name : " + name;
	}

	@GetMapping("/path")
	public String iAmRequestParam(@RequestParam("fname") String fname) {
		return "My Name : " + fname;
	}

}
