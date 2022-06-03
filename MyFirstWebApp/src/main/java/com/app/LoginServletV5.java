package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginv5")
public class LoginServletV5 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		
		RequestDispatcher rd = request.getRequestDispatcher("loginv3");
		rd.forward(request, response);

		//response.sendRedirect("loginv2?uid="+userId+"&pswd="+password);
	}
}
