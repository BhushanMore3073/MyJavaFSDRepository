<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.FlightDao"%>
<%@page import="com.model.FlightDetails"%>
<%@page import="com.dao.BookFlightDao"%>
<%@page import="com.model.BookFlight"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="MyStyles.css">
<title>User Activity</title>
</head>
<body>
	<%
	int User_Id = (int) request.getAttribute("uid");
	%>
	<center>
		<h2>
			Welcome to AirLine Reservation System
			<%=request.getParameter("username")%></h2>
		<br> <br>
		<hr>
		<h3>Plan Your Journey With Us</h3>
		<hr>
		<br> <br>
		<form action="UserController" method="post">
			<table>
				<input type="hidden" value="<%=User_Id%>" name="uid">
				<tr>
					<td align="right">Source City :</td>
					<td><input type="text" name="Source_City"></td>
				</tr>
				<tr>
					<td align="right">Destination City :</td>
					<td><input type="text" name="Destination_City"></td>
				</tr>
				<tr>
					<td align="right">Date Of Travel :</td>
					<td><input type="date" name="Date_of_Travel"></td>
				</tr>
				<tr>
					<td align="right">Total Persons :</td>
					<td><input type="number" name="Total_Persons"></td>
				</tr>
			</table>
			<br>
			<br> <input type="submit" name="userLogin" value="Search"
				class="button-8"> <input type="reset" value="Reset"
				class="button-8">
		</form>
		
		<%
		ArrayList<BookFlight> bflist = new BookFlightDao().getBookingHistory(User_Id);
		if (bflist.size() > 0) {
		%>
		<br><hr><h2>Your Travel History</h2><hr><br>
		<table border="1">
			<thead>
				<tr>
					<th>AirLine Name</th>
					<th>Flight Number</th>
					<th>Source City</th>
					<th>Destination City</th>
					<th>Date Of Travel</th>
					<th>Total Seats Booked By You</th>
					<th>Booking ID</th>
				</tr>
			</thead>
			<tbody>
				<%for (BookFlight bf : bflist) {
					FlightDetails fd = new FlightDao().getFlightByFlightId(bf.getFlight_Id());
				%>
				<tr>
					<td><%=fd.getAirLine_Name()%></td>
					<td><%=fd.getFlight_Number()%></td>
					<td><%=fd.getSource_City()%></td>
					<td><%=fd.getDestination_City()%></td>
					<td><%=fd.getDate_of_Travel()%></td>
					<td><%=bf.getTotal_Seats_Booked()%></td>
					<td><%=bf.getBooking_Id()%></td>
				</tr>
				<%
					}
				}
				%>
			</tbody>
		</table>
	</center>
</body>
</html>