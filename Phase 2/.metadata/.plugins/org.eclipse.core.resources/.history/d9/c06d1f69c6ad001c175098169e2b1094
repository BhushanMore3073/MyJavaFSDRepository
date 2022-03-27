<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<!-- To Handle User Login -->
		<%
		if (request.getParameter("b1").equals("User")) {
		%>
		<form action="UserController" method="post">
			<table>
				<tr>
					<td align="right">Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td align="right">Password</td>
					<td><input type="password" name="user_password"></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login" name="userLogin"></td>
				</tr>
			</table>
		</form>
		<h3><a href="UserRegistration.jsp">New User ? Click Here to Register</a></h3>
		<h4><a href="forgot.jsp?b1=UserForgot">Forgot Password</a></h4>
		<%
		}
		%>
		<!-- To Handle Admin Login -->
		<%
		if (request.getParameter("b1").equals("Admin")) {
		%>
		<form action="AdminController" method="post">
			<table>
				<tr>
					<td align="right">Username</td>
					<td><input type="text" name="admin_username"></td>
				</tr>
				<tr>
					<td align="right">Password</td>
					<td><input type="password" name="admin_password"></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login" name="adminLogin"></td>
				</tr>
			</table>
		</form>
		<h4><a href="forgot.jsp?b1=AdminForgot">Forgot Password</a></h4>
		<%
		}
		%>
	</center>
</body>
</html>