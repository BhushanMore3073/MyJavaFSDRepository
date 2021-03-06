package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookFlightDao;
import com.dao.FlightDao;
import com.model.BookFlight;
import com.model.FlightDetails;
import com.model.User;
import com.utils.MyDB;

@WebServlet("/BookFlightController")
public class BookFlightController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("b1").equals("Book"))
		{
			Object[] obj = new BookFlightDao().bookFlightReview(Integer.parseInt(request.getParameter("uid")), Integer.parseInt(request.getParameter("fid")), Integer.parseInt(request.getParameter("Total_Persons")));
			//request.getSession().setAttribute("Total_Persons", request.getParameter("Total_Persons"));
			if(obj[0]!=null && obj[1]!=null)
			{
				User u = (User)obj[0];
				FlightDetails fd = (FlightDetails)obj[1];
				request.setAttribute("u", u);
				request.setAttribute("fd", fd);
				request.getRequestDispatcher("ReviewPage.jsp").forward(request, response);				
			}
			
		}
		if(request.getParameter("b1").equals("Confirm"))
		{
			User u = (User)request.getSession().getAttribute("u");
			FlightDetails fd = (FlightDetails)request.getSession().getAttribute("fd");
			BookFlight bf = new BookFlight();
			bf.setUser_Id(u.getUserId());
			bf.setFlight_Id(fd.getFlight_Id());
			
			String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
			StringBuilder sb = new StringBuilder(10);			  
	        for (int i = 0; i < 10; i++) {
	            int index = (int)(AlphaNumericString.length()*Math.random());
	            sb.append(AlphaNumericString.charAt(index));
	        }
			bf.setBooking_Id(sb.toString());
			
			int tp = Integer.parseInt(request.getSession().getAttribute("Total_Persons").toString());
			
			if(new BookFlightDao().bookFlight(bf, tp)>0)
			{
				new FlightDao().updateSeats(tp, fd.getFlight_Id());
				request.getRequestDispatcher("BookingSuccess.html").forward(request, response);
			}
		}
		if(request.getParameter("b1").equals("History"))
		{
			response.getWriter().println("Checking History");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
