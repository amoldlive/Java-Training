package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loginv9", initParams = { @WebInitParam(name = "userIdInit", value = "admin"),
		@WebInitParam(name = "passwordInit", value = "admin123") })
public class LoginServletV9 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		ServletConfig config = getServletConfig();
		String configUserId = config.getInitParameter("userIdInit");
		String configUserPswd = config.getInitParameter("passwordInit");

		System.out.println("Configured uid : " + configUserId);
		System.out.println("Configured password : " + configUserPswd);
		PrintWriter out = response.getWriter();

		if (configUserId.equals(userId) && configUserPswd.equals(password)) {
			out.print("<h1>");
			out.print("Login successfull");
			out.print("</h1>");
		} else {
			out.print("<h1>");
			out.print("Unauthorized | Check user Id or Password");
			out.print("</h1>");
			out.print("<br><br><a href=\"loginV9.html\">Login Here</a>");

		}
	}

}
