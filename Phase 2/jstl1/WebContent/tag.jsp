<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet. *" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
 
<sql:update dataSource="${db}" var="count">  
INSERT INTO emp VALUES (101,'Birendra', 25000, 21);     
</sql:update>

<sql:update dataSource="${db}" var="count">  
INSERT INTO emp VALUES (102,'Biru', 4500, 26);    
</sql:update>

<sql:update dataSource="${db}" var="count">  
INSERT INTO emp VALUES (103,'Biralu', 19000, 28);    
</sql:update>

<sql:update dataSource="${db}" var="count">  
INSERT INTO emp VALUES (104,'Veera', 500, 54);     
</sql:update>

<sql:update dataSource="${db}" var="count">  
INSERT INTO emp VALUES (105,'Jitu', 1200, 27);    
</sql:update>


<c:set var="id" value="102"/>  
	<sql:update dataSource="${db}" var="count">  
		DELETE FROM emp WHERE id = ?  
	 <sql:param value="${id}" />  
</sql:update> 

<c:set var="id" value="104"/>  
	<sql:update dataSource="${db}" var="count">  
		DELETE FROM emp WHERE id = ?  
	 <sql:param value="${id}" />  
</sql:update> 

<c:set var="salary" value="20000.00"/>  
	<sql:update dataSource="${db}" var="count">  
		UPDATE emp
SET 
    name = 'Manager'
WHERE
    salary>?;
	 <sql:param value="${20000.00}" />  
</sql:update> 


<sql:query dataSource="${db}" var="rs">    
	SELECT * FROM emp WHERE id  BETWEEN 101 and 104;
</sql:query> 


<table border="2" width="100%">  
<tr>  
<th>Employee ID</th>  
<th>Employee Name</th>  
<th>Salary</th>  
<th>Age</th>  
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.id}"/></td>  
			<td><c:out value="${table.name}"/></td>  
			<td><c:out value="${table.salary}"/></td>  
			<td><c:out value="${table.age}"/></td>  
		</tr>  
	</c:forEach>  
</table>

</body>

</html>