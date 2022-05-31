package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginv7")
public class LoginServletV7 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		/*
		HttpSession session = request.getSession();
		session.setAttribute("uid", userId);
		session.setAttribute("pswd", password);
		 */
		response.sendRedirect("loginredirect");
	}

}
