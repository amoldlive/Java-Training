package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalculationServlet extends HttpServlet {
		
	
	@Override
	public void init() throws ServletException {

	}
	
	@Override
	public void destroy() {

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.valueOf(request.getParameter("num1"));
		int num2=Integer.valueOf(request.getParameter("num2"));
		
		String[] selectVal=request.getParameterValues("calc");
		int result=0;
		
		
		if(selectVal[0].equalsIgnoreCase("add")) {
			result=num1+num2;
		}else if(selectVal[0].equalsIgnoreCase("sub")) {
			result=num1-num2;
		}else if(selectVal[0].equalsIgnoreCase("mul")) {
			result=num1*num2;
		}else {
			result=num1/num2;
		}
		
		
	
		PrintWriter out=response.getWriter();
		out.print("<h1>");
		out.print("Result  = "+result);
		out.print("<h1>");
		
	}
	
}
