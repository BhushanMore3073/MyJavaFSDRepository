package com.controller;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericServletDemo")
public class GenericServletDemo extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Welcome To Generic Servlet Demo "+request.getParameter("name"));
	}

}
