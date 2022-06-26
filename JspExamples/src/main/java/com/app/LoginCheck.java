package com.app;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logincheck")
public class LoginCheck extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userId = req.getParameter("userId");
		String password = req.getParameter("password");

		// Take from DB
		LoginManager loginManager = new LoginManager();
		String dbPassword = loginManager.getPassword(userId);
		
		if (null != dbPassword && password.equals(dbPassword)) {
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("uid", userId);
			httpSession.setAttribute("loginTime", new Date());
			
			resp.sendRedirect("loginsuccess.jsp");
		} else {
			resp.sendRedirect("loginfailure.jsp");
		}

	}
}
