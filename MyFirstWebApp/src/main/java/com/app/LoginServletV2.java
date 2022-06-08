package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginv2")
public class LoginServletV2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String validUid = "admin";
		String validPswd = "admin123";

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		PrintWriter out = response.getWriter();

		if (validUid.equals(userId) && validPswd.equals(password)) {
			out.print("<h1>");
			out.print("Login successfull");
			out.print("</h1>");
		} else {
			out.print("<h1>");
			out.print("Unauthorized | Check user Id or Password");
			out.print("</h1>");
			out.print("<br><br><a href=\"loginV1.html\">Login Here</a>");
			
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}
}
