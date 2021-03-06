package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.FlightDetails;
import com.model.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("userLogin").equals("Login"))
		{
			int uid = new UserDao().checkUserLogin(request.getParameter("username"), request.getParameter("user_password"));
			if(uid > 0)
			{
				request.setAttribute("uid", uid);
				request.getRequestDispatcher("UserActivity.jsp").forward(request, response);
			}
			else
			{
				response.getWriter().println("<center><h3 style=\"color:red;\">Check Your Credentials</h3></center>");
				request.getRequestDispatcher("login.jsp?b1=User").include(request, response);
			}
		}
		if(request.getParameter("userLogin").equals("Register"))
		{
			User u = new User();
			u.setAge(Integer.parseInt(request.getParameter("age")));
			u.setCountry(request.getParameter("country"));
			u.setUserAadhar(request.getParameter("aadhar"));
			u.setUserEmail(request.getParameter("email"));
			u.setUserFullName(request.getParameter("fullname"));
			u.setUsername(request.getParameter("username"));
			String pass = request.getParameter("password"),cnfpass = request.getParameter("cnfpassword");
			if(pass.equals(cnfpass))
			{
				u.setUserPassword(pass);
				if(new UserDao().registerUser(u)>0)
				{
					request.getRequestDispatcher("UserActivity.jsp").forward(request, response);
				}
			}
		}
		if(request.getParameter("userLogin").equals("Forgot"))
		{
			request.getRequestDispatcher("forgot.jsp?b1=UserForgot").forward(request, response);
		}
		if(request.getParameter("userLogin").equals("Search"))
		{
			String source = request.getParameter("Source_City");
			String destination = request.getParameter("Destination_City");
			String date_of_travel = request.getParameter("Date_of_Travel");
			ArrayList<FlightDetails> list = new UserDao().searchFlight(source, destination, date_of_travel);
			int uid = Integer.parseInt(request.getParameter("uid"));
			if(list.size()>0)
			{
				request.setAttribute("uid", uid);
				request.setAttribute("list", list);
				request.getRequestDispatcher("SearchResult.jsp").forward(request, response);
			}
			else
			{
				response.getWriter().println("<center><h3 style=\"color:red;\">Please Enter Proper Details</h3></center>");
				request.getRequestDispatcher("UserActivity.jsp").include(request, response);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
