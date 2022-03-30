<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="welcome :"+session.getAttribute("username")+"<br>" %>
<%="your details are as following: " %>

<br><br>
<%="Age :"+session.getAttribute("age")+"<br>" %>
<%="Gender :"+session.getAttribute("gender")+"<br>" %>
<%="City:"+session.getAttribute("city")+"<br>" %>
<%="Email :"+session.getAttribute("email")+"<br>" %>

<%=session.getMaxInactiveInterval()+"<br>" %>
<%=session.getId()+"<br>" %>
<%=session.getCreationTime()+"<br>" %>
<%=session.isNew()+"<br>" %>
</body>
</html>