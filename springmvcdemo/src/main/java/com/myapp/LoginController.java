package com.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

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
	
	@RequestMapping("/loginv4")
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
}