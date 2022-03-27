package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("username").equals("Bhushan") && request.getParameter("password").equals("B@123"))
		{
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("error.html").forward(request, response);
		}
	}

}
