package com.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.model.User;
import com.myapp.repository.MyAppRepositoryImpl;

@Controller
public class LoginController {

	@Autowired
	MyAppRepositoryImpl appRepositoryImpl;

	@RequestMapping("/login")
	public String login() {
		return "display";

	}

	@RequestMapping("/loginv2")
	public ModelAndView loginv2(HttpServletRequest request, HttpServletResponse response) {

		String defaultUid = "admin";
		String defaultpswd = "admin123";

		String userID = request.getParameter("uid");
		String password = request.getParameter("pswd");

		ModelAndView modelAndView = new ModelAndView();

		if (defaultUid.equals(userID) && defaultpswd.equals(password)) {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("display2");
		} else {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("loginfailure");
		}
		return modelAndView;

	}

	@RequestMapping("/loginv3")
	public ModelAndView loginv3(@RequestParam("uid") String usrId, @RequestParam("pswd") String usrPswd) {

		String defaultUid = "admin";
		String defaultpswd = "admin123";

		String userID = usrId;
		String password = usrPswd;

		ModelAndView modelAndView = new ModelAndView();

		if (defaultUid.equals(userID) && defaultpswd.equals(password)) {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("display2");
		} else {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("loginfailure");
		}
		return modelAndView;
	}

	@RequestMapping(path = "/loginv4", method = RequestMethod.POST)
	public ModelAndView loginv4(@RequestParam("uid") String usrId, @RequestParam("pswd") String usrPswd) {

		String defaultUid = "admin";
		String defaultpswd = "admin123";

		String userID = usrId;
		String password = usrPswd;

		ModelAndView modelAndView = new ModelAndView();

		if (defaultUid.equals(userID) && defaultpswd.equals(password)) {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("loginsuccess");
		} else {
			modelAndView.addObject("userId", userID);
			modelAndView.setViewName("loginfailure");
		}
		return modelAndView;
	}

	@RequestMapping(path = "/loginv5", method = RequestMethod.POST)
	public ModelAndView loginv5(@RequestParam("uid") String usrId, @RequestParam("pswd") String usrPswd) {

		User user = null;
		ModelAndView modelAndView = new ModelAndView();

		try {
			user = appRepositoryImpl.getUserById(usrId, usrPswd);
			if (null != user) {
				modelAndView.addObject("userId", usrId);
				modelAndView.setViewName("loginsuccess");
			} else {
				modelAndView.addObject("userId", usrId);
				modelAndView.setViewName("loginfailure");
			}
		} catch (Exception e) {
			System.out.println("Exception while fetching user details : " + e);
			modelAndView.addObject("userId", usrId);
			modelAndView.setViewName("loginfailure");
		}

		return modelAndView;
	}

}