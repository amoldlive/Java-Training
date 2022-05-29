package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AdditionServlet extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//logic
		//System.out.println("Hello World");
		int num1=Integer.valueOf(request.getParameter("num1"));
		int num2=Integer.valueOf(request.getParameter("num2"));
		
		int sum=num1+num2;
		
		PrintWriter out= response.getWriter();
		out.println("<h1>Addition - "+sum+"</h1>");
		
	}
	
}
