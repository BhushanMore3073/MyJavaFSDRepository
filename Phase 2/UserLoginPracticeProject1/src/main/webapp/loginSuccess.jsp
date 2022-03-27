<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
	Welcome
	<%=request.getParameter("username")%>
	<a href="LogoutServlet">Logout</a>
</body>
</html>