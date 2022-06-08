package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginredirect2")
public class LoginRedirectServlet2 extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String validUid = "admin";
		String validPswd = "admin123";

		String userId = null;
		String password = null;
		
		Cookie[] cookieList=request.getCookies();
		
		for(Cookie cookie:cookieList) {
			String cookieName=cookie.getName();
			System.out.println(cookieName);
			
			if(cookieName.equals("uid")) {
				userId=cookie.getValue();
			}else if(cookieName.equals("pswd")) {
				password=cookie.getValue();
			}
		}	
		
		PrintWriter out = response.getWriter();
		
		System.out.println("User ID  : "+userId);
		System.out.println("Password  : "+password);
		
		if (validUid.equals(userId) && validPswd.equals(password)) {
			out.print("<h1>");
			out.print("Login successfull");
			out.print("</h1>");
		} else {
			out.print("<h1>");
			out.print("Unauthorized | Check user Id or Password");
			out.print("</h1>");
			out.print("<br><br><a href=\"loginV8.html\">Login Here</a>");

		}

	}
}
