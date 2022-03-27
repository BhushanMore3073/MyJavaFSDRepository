<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Travel details</title>
</head>
<body>
<div align="right">
<a href="AdminPage.jsp" style="color:red;text-decoration:none ;font-size:20px;font-weight:bold;" >Admin Login</a>
</div>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user!=null){
%>
<p>Welcome <%=user.get("username") %></p>
<a href="Logout">Logout</a>
<%
	}else{
%>
<a href=UserPage.jsp style="color:red;text-decoration:none ;font-size:20px;font-weight:bold;">User Login</a>
<%
	}
%>
<br><br>
<center>
<div style="border:5px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=FlightList method=post>
	<label for=from style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	From :-</label> <input type=text name=from id=from/><br><br>
	<label for=to style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	To :-</label> <input type=text name=to id=to/><br><br>
	<label for=departure style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Departure :-</label> <input type=date name=departure id=departure/><br><br>
	<label for=travellers style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Travellers :-</label> <input type=number name=travellers id=travellers/><br><br>
	<input type=submit value=Search style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/>
	 <input type=reset style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre" />
</form>
</div>
</center>
</body>
</html>