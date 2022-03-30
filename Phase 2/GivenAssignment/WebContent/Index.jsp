<%@page import="javax.print.attribute.DateTimeSyntax"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
 <h1>welcome to student page</h1>
 <%
 Date date=new Date();
 out.println("<h2>"+"todays date:"+date.toString()+"</h2>"); 
 %>
 <form action="Logn1.jsp" method="Get">
 <input type="submit" name="Login " value="Login">
   </form>
<form action="Register1.jsp" method="Get">
 <input type="submit" name="Register " value="Register">
   </form>

</body>
</html>