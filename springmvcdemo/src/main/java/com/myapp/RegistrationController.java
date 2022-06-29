package com.myapp;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.model.User;
import com.myapp.repository.MyAppRepositoryImpl;

@Controller
public class RegistrationController {

	@Autowired
	MyAppRepositoryImpl appRepositoryImpl;

	@PostMapping("/registeruser")
	public ModelAndView registerUser(@RequestParam("uid") String usrId, @RequestParam("pswd") String usrPswd,
			@RequestParam("cpswd") String cusrPswd, @RequestParam("bdate") String bdate,
			@RequestParam("gender") String gender, @RequestParam("address") String address,
			@RequestParam("city") String city, @RequestParam("state") String state) {

		String userID = usrId;
		String password = usrPswd;
		String confirmPassword = cusrPswd;

		ModelAndView modelAndView = new ModelAndView();

		if (password.equals(confirmPassword)) {
			UUID uuid = UUID.randomUUID();
			try {
				User user = new User();
				user.setUserno(uuid.toString());
				user.setUserid(userID);
				user.setUserpassword(password);
				user.setUsercreationdate(new Date().toString());
				user.setDob(bdate);
				user.setAddress(address);
				user.setGender(gender);
				user.setCity(city);
				user.setState(state);
				appRepositoryImpl.saveUser(user);
				modelAndView.setViewName("registrationsuccess");
			} catch (Exception e) {
				System.out.println("Exception while saving user : " + e);
				modelAndView.setViewName("registrationfailure");
			}

		} else {

			modelAndView.setViewName("registrationfailure");
		}
		return modelAndView;
	}

	@GetMapping("/showallusers")
	public ModelAndView showAllUsers() {

		ModelAndView modelAndView = new ModelAndView();
		List<User> userList = null;

		try {
			userList = appRepositoryImpl.getAllUsers();

		} catch (Exception e) {
			System.out.println("Exception while getting user Data : " + e);
		}

		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("showregistereduser");

		return modelAndView;
	}

}