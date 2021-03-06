package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDao;
import com.model.FlightDetails;

public class FlightController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FlightDetails flightDetails = null;
		
		if (request.getParameter("b1").equals("Add")) {
			flightDetails = new FlightDetails();
			flightDetails.setAirLine_Name(request.getParameter("AirLine_Name"));
			flightDetails.setTicket_Price(Double.parseDouble(request.getParameter("Ticket_Price")));
			flightDetails.setSource_City(request.getParameter("Source_City"));
			flightDetails.setDestination_City(request.getParameter("Destination_City"));
			flightDetails.setDeparture_time_from_source(request.getParameter("Departure_time_from_source"));
			flightDetails.setArrival_time_at_Destination(request.getParameter("Arrival_time_at_destination"));
			flightDetails.setFlight_Number(request.getParameter("Flight_Number"));
			flightDetails.setDate_of_Travel(request.getParameter("Date_of_Travel"));
			flightDetails.setTotal_Seats(Integer.parseInt(request.getParameter("Total_Seats")));
			flightDetails.setBooked_Seats(Integer.parseInt(request.getParameter("Booked_Seats")));
			flightDetails.setSeat_Availability(Integer.parseInt(request.getParameter("Seat_Availability")));
			flightDetails.setClases(request.getParameter("clases"));

			if ((new FlightDao().addFlight(flightDetails)) > 0) {
				response.getWriter().println("<h4 style=\"color:green;\">Details Added successfully</h4>");
				request.getRequestDispatcher("AdminActivity.jsp").forward(request, response);
			} else {
				response.getWriter().println("<h4 style=\"color:red;\">Error Occured</h4>");
				request.getRequestDispatcher("AdminActivity.jsp").include(request, response);
			}
		}
		if (request.getParameter("b1").equals("Display"))
		{
			if ((new FlightDao().displayFlightByFlightNumber(request.getParameter("Flight_Number"))!=null)) {
				request.setAttribute("fd", new FlightDao().displayFlightByFlightNumber(request.getParameter("Flight_Number")));
				request.getRequestDispatcher("DisplayFlightToAdmin.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("AdminActivity.jsp").include(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
