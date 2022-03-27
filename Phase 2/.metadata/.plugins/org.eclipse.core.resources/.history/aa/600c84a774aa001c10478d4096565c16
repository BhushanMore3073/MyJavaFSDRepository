<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
<div style="border:3px solid green;width:25%;border-radius:20px;padding:20px" align="center">
<form action=InsertFlight method=post>
	<label for=name style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Name :-</label> <input type="text" name=name id=name /><br><br>
	<label for=from style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	From :-</label> <input type="text" name=from id=from /><br><br>
	<label for=to style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	To :-</label> <input type="text" name=to id=to /><br><br>
	<label for=departure style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Departure :-</label> <input type="date" name=departure id=departure /><br><br>
	<label for=time style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Time :-</label> <input type="time" name=time id=time /><br><br>
	<label for=price style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Price :-</label> <input type="text" name=price id=price /><br><br>
	<input type=submit value=submit style="color:green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/> 
	<input type=reset style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/>
</form>
</div>
</center>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>