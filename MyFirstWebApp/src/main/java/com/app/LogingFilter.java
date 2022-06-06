package com.app;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class LogingFilter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Request Host : " + request.getLocalName() + " | Request Port : " + request.getLocalPort()
				+ " | Request URL : " + request.getRequestURL() + " | Request Encoding : "
				+ request.getCharacterEncoding());
		chain.doFilter(request, response);
	}
}
