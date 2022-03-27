<%@page import="com.model.FlightDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% FlightDetails fd = (FlightDetails)request.getAttribute("fd"); %>
	<center>
	<h2>Flight Details</h2>
	<hr><hr>
		<table>
			<tr>
				<td align="right">AirLine Name :</td>
				<td align="left"><%=fd.getAirLine_Name()%></td>
			</tr>
			<tr>
				<td align="right">Flight Number :</td>
				<td align="left"><%=fd.getFlight_Number()%></td>
			</tr>
			<tr>
				<td align="right">Source City :</td>
				<td align="left"><%=fd.getSource_City()%></td>
			</tr>
			<tr>
				<td align="right">Destination City :</td>
				<td align="left"><%=fd.getDestination_City()%></td>
			</tr>
			<tr>
				<td align="right">Schedule On :</td>
				<td align="left"><%=fd.getDate_of_Travel()%></td>
			</tr>
			<tr>
				<td align="right">Departure Time :</td>
				<td align="left"><%=fd.getDeparture_time_from_source()%></td>
			</tr>
			<tr>
				<td align="right">Arrival Time :</td>
				<td align="left"><%=fd.getArrival_time_at_Destination()%></td>
			</tr>
			<tr>
				<td align="right">Total Seats :</td>
				<td align="left"><%=fd.getTotal_Seats()%></td>
			</tr>
			<tr>
				<td align="right">Booked Seats :</td>
				<td align="left"><%=fd.getBooked_Seats()%></td>
			</tr>
			</tr>
			<td align="right">Available Seats :</td>
			<td align="left"><%=fd.getSeat_Availability()%></td>
			</tr>
			<tr>
				<td align="right">Class :</td>
				<td align="left"><%=fd.getClases()%></td>
			</tr>
			<tr>
				<td align="right">Ticket Price :</td>
				<td align="left"><%=fd.getTicket_Price()%></td>
			</tr>
		</table>
	</center>
</body>
</html>