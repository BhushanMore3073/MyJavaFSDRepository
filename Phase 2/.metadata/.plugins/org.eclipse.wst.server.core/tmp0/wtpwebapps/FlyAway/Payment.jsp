<%@page import="com.model.User"%>
<%@page import="com.model.FlightDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="MyStyles.css">
<title>Payment</title>
</head>
<body>
	<%
	FlightDetails fd = (FlightDetails) session.getAttribute("fd");
	User u = (User) session.getAttribute("u");
	%>
	<center>
		<br>
		<br>
		<h2>Payment</h2>
		<br>
		<hr>
		<br>
		<br>
		<form action="BookFlightController" method="post">
			<table>
				<tr>
					<td align="right"><span
						style="margin:2px ; font-style: oblique; font-size: 30px; font-family: monospace; color: rgb(0, 47, 97);">Name
							: </span></td>
					<td><span
						style="margin:2px ; font-style: oblique; font-size: 30px; font-family: monospace; color: rgb(0, 47, 97);"><%=u.getUserFullName()%></span></td>
				</tr>
				<tr>
					<td align="right"><span
						style="margin:2px ; font-style: oblique; font-size: 30px; font-family: monospace; color: rgb(0, 47, 97);">Total
							Amount Due :</span></td>
					<td><span
						style="font-style: oblique; font-size: 30px; font-family: monospace; color: rgb(255, 100, 0);">Rs.</span>&nbsp;
						<span
						style="margin:2px; font-style: oblique; font-size: 30px; font-family: monospace; color: rgb(255, 100, 0);"><%=fd.getTicket_Price()%></span></td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" name="b1" value="Confirm" class="button-8">
		</form>
	</center>
</body>
</html>