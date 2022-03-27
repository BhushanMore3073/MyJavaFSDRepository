package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DisplayProduct")
public class DisplayProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("pid", request.getParameter("pid"));
		session.setAttribute("pname", request.getParameter("pname"));
		session.setAttribute("pdescription", request.getParameter("pdescription"));
		session.setAttribute("pprice", request.getParameter("pprice"));
		
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}
}
