<%@page import="com.model.FlightDetails"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<FlightDetails> list = (ArrayList<FlightDetails>)request.getAttribute("list"); %>
<h2>Flights Available </h2>
<%
int uid = (int)request.getAttribute("uid"); 
int Total_Persons = Integer.parseInt(request.getParameter("Total_Persons"));%>
		<hr>
		<table border="1">
			<thead>
			<tr>
				<th>AirLine Name</th>
				<th>Flight Number</th>
				<th>Source City</th>
				<th>Destination City</th>
				<th>Schedule On</th>
				<th>Departure Time</th>
				<th>Arrival Time</th>
				<th>Total Seats</th>
				<th>Booked Seats</th>
				<th>Seats Available</th>
				<th>Class</th>
				<th>Ticket Price</th>
				<th>Booking Link</th>
			</tr>
			</thead>
			<tbody>
		  <%for(FlightDetails fd:list) {%>
			<tr>
				<td align="center"><%=fd.getAirLine_Name() %></td>
				<td align="center"><%=fd.getFlight_Number() %></td>
				<td align="center"><%=fd.getSource_City() %></td>
				<td align="center"><%=fd.getDestination_City() %></td>
				<td align="center"><%=fd.getDate_of_Travel() %></td>
				<td align="center"><%=fd.getDeparture_time_from_source() %></td>
				<td align="center"><%=fd.getArrival_time_at_Destination() %></td>
				<td align="center"><%=fd.getTotal_Seats() %></td>
				<td align="center"><%=fd.getBooked_Seats() %></td>
				<td align="center"><%=fd.getSeat_Availability() %></td>
				<td align="center"><%=fd.getClases() %></td>
				<td align="center"><%=fd.getTicket_Price() %></td>
				<td align="center"><a href="BookFlightController?b1=Book&uid=<%=uid%>&fid=<%=fd.getFlight_Id()%>&Total_Persons=<%=Total_Persons%>">Book Flight</a></td>
			</tr>
			
			
			
			<%}%>
			</tbody>
		</table>
</body>
</html>