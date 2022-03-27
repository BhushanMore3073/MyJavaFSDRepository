<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<a href=HomePage.jsp style="color:red;text-decoration:none ;font-size:35px;font-weight:bold;">Take A Fly</a>
<br><br>
<center>
<h2>Admin Login</h2>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=AdminLogin method=post>
	<label for=email style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Email :-</label> <input type="email" name=email id=email /><br><br>
	<label for=pass style="color:Red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
	Password :-</label> <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/> 
	<input type=reset style="color:red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/>
</form>
</div>
</center><br>
<a href=forgotPassword.jsp style="font-size:25;color:red;">Forgot Password</a>

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