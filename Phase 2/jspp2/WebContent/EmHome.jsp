<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="welcome"+request.getParameter("username") %>
<%="your details are as following: " %>

<%="Age"+request.getParameter("age") %>
<%="City"+request.getParameter("city") %>
<%="Gender"+request.getParameter("gender") %>
<%="Email"+request.getParameter("email") %>

<% session.setAttribute("username", request.getParameter("username")) ;
session.setAttribute("age", request.getParameter("age")) ;
session.setAttribute("city", request.getParameter("city")) ;
session.setAttribute("gender", request.getParameter("gender")) ;
session.setAttribute("email", request.getParameter("email")) ;
response.sendRedirect("StoreData.jsp");
%>


</body>
</html>