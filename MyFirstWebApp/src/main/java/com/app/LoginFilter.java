package com.app;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/loginv10", initParams = { @WebInitParam(name = "userIdInit", value = "admin"),
		@WebInitParam(name = "passwordInit", value = "admin123") })
public class LoginFilter extends HttpFilter {

	String configUserId = null;
	String configUserPswd = null;

	@Override
	public void init(FilterConfig config) throws ServletException {

		System.out.println("initializing Filter");

		configUserId = config.getInitParameter("userIdInit");
		configUserPswd = config.getInitParameter("passwordInit");

		System.out.println("Configured uid : " + configUserId);
		System.out.println("Configured password : " + configUserPswd);

	}

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("******inside do filter ********");
		
		String userId = request.getParameter("uid");
		String password = request.getParameter("pswd");

		if (configUserId.equals(userId) && configUserPswd.equals(password)) {
			chain.doFilter(request, response);
		}else {
			response.sendRedirect("loginFailure.jsp");
		}
	}

	@Override
	public void destroy() {
		System.out.println("Destroying Filter");
	}

}
