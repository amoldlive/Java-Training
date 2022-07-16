package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.model.User;
import com.myapp.repository.MyAppRepositoryImpl;

@RestController
public class UserDetailsController {

	@Autowired
	MyAppRepositoryImpl appRepositoryImpl;

	@GetMapping("/getalluser")
	public List<User> getAllUsers() {
		return appRepositoryImpl.getAllUsers();
	}

	@PostMapping("/saveuser")
	public String saveuser(@RequestBody User user) {
		int result = appRepositoryImpl.saveUser(user);
		System.out.println("Result : "+result);
		return result + "";
	}

	@GetMapping("/getuser")
	public User getUser(@RequestParam("username") String username,@RequestParam("password") String password) {
		return appRepositoryImpl.getUserById(username, password);
	}
	
	/*Assignment : implement Update , depete functionality */

}
