package com.ku.dku.controller;

import java.io.IOException;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

@Order(1)

public class Filtter implements Filter {

	@Override

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)

			throws IOException, ServletException {

		HttpServletRequest httpRequest =  (HttpServletRequest) request;
		System.out.println(httpRequest.getRequestURI());
		boolean check = httpRequest.getRequestURI().startsWith("/user");
		System.out.print(httpRequest.getSession().getAttribute("username"));
		if (check && httpRequest.getSession().getAttribute("username") == null) {

			HttpServletResponse httpResponse = (HttpServletResponse) response;
			JSONObject result = new JSONObject();
			result.put("status", "notLogin");
			httpResponse.setStatus(HttpServletResponse.SC_OK);
			httpResponse.getWriter().write(result.toString());
			httpResponse.getWriter().flush();
			httpResponse.getWriter().close();
			return;
		}

		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}






}
