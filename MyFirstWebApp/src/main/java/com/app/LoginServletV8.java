package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginv8")
public class LoginServletV8 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		Cookie cookie1=new Cookie("uid",userId);
		Cookie cookie2=new Cookie("pswd",password);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		
		response.sendRedirect("loginredirect2");
	}

}
