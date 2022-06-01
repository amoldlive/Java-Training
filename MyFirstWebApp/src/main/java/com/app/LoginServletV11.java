package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginv11")
public class LoginServletV11 extends HttpServlet {

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

		if (validUid.equals(userId) && validPswd.equals(password)) {
			
			request.setAttribute("Date", String.valueOf(new Date()));
			RequestDispatcher rd = request.getRequestDispatcher("loginsuccess2");
			rd.forward(request, response);
		} else {
			response.sendRedirect("loginFailure.jsp");

		}

	}
}
