package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginv4")
public class LoginServletV4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String validUid = "admin";
		String validPswd = "admin123";

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");

		if (validUid.equals(userId) && validPswd.equals(password)) {

			RequestDispatcher rd = request.getRequestDispatcher("loginsuccess");
			rd.forward(request, response);

			// RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.html");
			// rd.forward(request, response);

			 //RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
			// rd.forward(request, response);

		} else {
			// RequestDispatcher rd = request.getRequestDispatcher("loginfailed");
			// rd.forward(request, response);

			out.println("Invalid UserName or Password !");
			RequestDispatcher rd = request.getRequestDispatcher("/loginV4.html");
			rd.include(request, response);
		}

	}
}
