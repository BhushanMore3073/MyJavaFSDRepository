<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Welcome <%=request.getParameter("username")%></h2>
<h3>Fill the details below</h3>
<form action="Submit.jsp">
<table>
<tr>
			<td align="right">10th Marks Percentage</td>
				<td><input type="number" name="10th"></td>
			</tr>
			<tr>
				
			</tr><td align="right">12th Marks Percentage</td>
				<td><input type="number" name="12th"></td>
			<tr>
				<td align="right">Schoolname</td>
				<td><input type="text" name="schoolname" ></td>
			</tr>
			<tr>
				<td align="right">math marks/100</td>
				<td><input type="number" name="math"></td>
			</tr>
			<tr>
				<td align="right">chemistry marks/100</td>
				<td><input type="number" name="chemistry"></td>
			</tr>
			<tr>
				<td align="right">physics marks/100</td>
				<td><input type="number" name="physics"></td>
			</tr>
			<tr>
				<td align= "center" colspan="2">
				<input type="submit" value="submit" name="submit" ></td>
			</tr>
			</table>
			</form>
			</center>
			</body>
</html>