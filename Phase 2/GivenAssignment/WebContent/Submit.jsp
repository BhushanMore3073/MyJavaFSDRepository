<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final record page</title>
</head>
<body><center>
<table>
  <tr>
		<td align="right">10th Marks Percentage</td>
			<td><input type="number" name="10th" ></td>
			</tr>
			
			<tr>
				<td align="right">12th Marks Percentage</td>
				<td><input type="number" name="12th" ></td>
			<tr>
			<tr><td align="right">Total marks of pcm</td>
			<%int sum = Integer.parseInt(request.getParameter("maths"))+Integer.parseInt(request.getParameter("physics"))+Integer.parseInt(request.getParameter("chemistry"));%>
			</tr>
			</table>
			</center>
			</body>
			</html>