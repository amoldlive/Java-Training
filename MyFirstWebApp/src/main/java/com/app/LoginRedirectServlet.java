package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginredirect")
public class LoginRedirectServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String validUid = "admin";
		String validPswd = "admin123";

		
		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");
		 
		/* 
		HttpSession session=request.getSession();
		//session.removeAttribute("uid");
		String userId=(String) session.getAttribute("uid");
		String password=(String) session.getAttribute("pswd");
		*/
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
			out.print("<br><br><a href=\"loginV7.html\">Login Here</a>");

		}

	}
}
