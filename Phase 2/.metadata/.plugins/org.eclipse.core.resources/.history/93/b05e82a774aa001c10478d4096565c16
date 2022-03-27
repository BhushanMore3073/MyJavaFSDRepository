<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body bgcolor="yellow">
<br>
<a href=HomePage.jsp style="color:red;text-decoration:none ;font-size:35px;font-weight:bold;">Take A Fly</a>
<br><br>
<center>
<h2>User Login</h2>
<div style="border:2px solid black;width:25%; border-radius:20px;padding:20px"; align="center"; color= green>
<form action=UserLogin method=post >
    <table >
    <tr>
    <td><label for=email style="color:blue;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
    Email</label><br></td>
    <td><input type="email" name=email id=email /></td>
    </tr>
    <tr>
    <td><label for=pass style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre">
    Password</label><br></td>
    <td><input type="password" name=password id=pass /></td>
    </tr>
    
    <tr>
    <td><input type=submit value=submit style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/></td>
    <td><input type=reset style="color:red;text-decoration:none ;font-size:20px;font-weight:bold;" align="centre"/></td>
    </tr>
    </table>
	
</form>
</div>
</center>
<br><br>
<i>New User ? Click below to create new account</i>
<h4><a href=UserRegistrion.jsp style="font-size:25;color:blue;" align="centre">Create Account New Account</a></h4>

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