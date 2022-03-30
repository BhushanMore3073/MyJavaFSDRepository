<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- set and out -->
--------set and out Attribute-----<br>
<c:set var="emp1" scope="session" value="20000"/> 
<c:out value="${emp1}"/> 
<br>
<c:set var="emp2" scope="session" value="25000"/>
 <c:out value="${emp2}"/>  
 <br>
 <c:set var="emp3" scope="session" value="12000"/>
 <c:out value="${emp3}"/>  
 <br>
 <c:set var="emp4" scope="session" value="10000"/>
 <c:out value="${emp4}"/>  
 <br><br>
 
 <c:set var="income" scope="session" value="${emp1}"/>
<c:choose>  
    <c:when test="${income >= 9000 && income <= 13000}">  
      <p> Emp1 income + bonus is: <c:out value="${income+5000}"/></p>
      </c:when>
    <c:when test="${income >= 13500 && income <=21000}">  
      <p> Emp1 income +bonus is: <c:out value="${income+7000 }"/></p> 
      </c:when>
      <c:when test="${income >= 22000 && income <=26000}">  
      <p> Emp1 income +bonus is: <c:out value="${income+9000 }"/></p> 
      </c:when>
      <c:when test="${ income >= 28000}">  
      <p> Emp1 income +bonus is: <c:out value="${income+10000 }"/></p> 
      </c:when>
    <c:otherwise>  
       Salary is undetermined...  
    </c:otherwise>  
</c:choose>  

<c:set var="income1" scope="session" value="${emp2}"/>

 <c:choose>  
    <c:when test="${income1 <= 13000 && income1 > 9000}">  
      <p> emp2 income + bonus is:<c:out value="${income1+5000 }"/></p>
      </c:when>>
    <c:when test="${income1 <= 21000 && income1 > 13500}">  
      <p> emp2 income +bonus is:<c:out value="${income1+7000 }"/></p> 
      </c:when>
      <c:when test="${income1 <= 26000 && income1 > 22000}">  
      <p> emp2 income +bonus is:<c:out value="${income1+9000 }"/></p> 
      </c:when>
      <c:when test="${ income1 >= 28000}">  
      <p> emp2 income +bonus is:<c:out value="${income1+10000 }"/></p> 
      </c:when>
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  

<c:set var="income2" scope="session" value="${emp3}"/>

 <c:choose>  
    <c:when test="${income2 <= 13000 && income2 > 9000}">  
      <p> emp1 income +bonus is:<c:out value="${income2+5000 }"/></p>
      </c:when>>
    <c:when test="${income2 <= 21000 && income2 > 13500}">  
      <p> emp2 income +bonus is:<c:out value="${income2+7000 }"/></p> 
      </c:when>
      <c:when test="${income2 <= 26000 && income2 > 22000}">  
      <p> emp3 income +bonus is:<c:out value="${income2+9000 }"/></p> 
      </c:when>
      <c:when test="${ income2 >= 28000}">  
      <p> emp4 income +bonus is:<c:out value="${income2+10000 }"/></p> 
      </c:when>
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
 
 <c:set var="income3" scope="session" value="${emp4 }"/>

 <c:choose>  
    <c:when test="${income3 <= 13000 && income3 > 9000}">  
      <p> emp1 income +bonus is:<c:out value="${income3+5000 }"/></p>
      </c:when>>
    <c:when test="${income3 <= 21000 && income3 > 13500}">  
      <p> emp2 income +bonus is:<c:out value="${income3+7000 }"/></p> 
      </c:when>
      <c:when test="${income3 <= 26000 && income3 > 22000}">  
      <p> emp3 income +bonus is:<c:out value="${income3+9000 }"/></p> 
      </c:when>
      <c:when test="${ income3 >= 28000}">  
      <p> emp4 income +bonus is:<c:out value="${income3+10000 }"/></p> 
      </c:when>
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
 <!-- remove -->
----------Remove Attribute------
<c:set var="income" scope="session" value="${emp1}"/>  
<p>Before Remove Value is: <c:out value="${emp1}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br>

<c:set var="income" scope="session" value="${emp2}"/>  
<p>Before Remove Value is: <c:out value="${emp2}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br>
<c:set var="income" scope="session" value="${emp3}"/>  
<p>Before Remove Value is: <c:out value="${emp3}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br>
<c:set var="income" scope="session" value="${emp4}"/>  
<p>Before Remove Value is: <c:out value="${emp4}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br><br>

</body>
</html>