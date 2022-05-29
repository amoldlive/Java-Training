package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myapp")
public class MyApp extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//logic
		//System.out.println("Hello World");
		String name=request.getParameter("nameId");
		
		PrintWriter out= response.getWriter();
		out.println("<h1>name - "+name+"</h1>");
		
	}
	
}
