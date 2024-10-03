<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Salary Demo</h1>
<b>Application Salary</b>
<c:out value="${applicationScope.salary }" /> <br>

<b>Session Salary</b>
<c:out value="${sessionScope.salary }" /> <br>

<b>Request Salary</b>
<c:out value="${requestScope.salary }"/> <br>

<c:if test="${sessionScope.salary>=3000 }">
	<b>My salary is :</b>
	<c:out value="${salary }"/>
</c:if>

<c:choose>
<c:when test="${sessionScope.salary <0 }"> Salary is very  low ${salary }</c:when>
<c:when test="${sessionScope.salary>6000 }">Salary is good ${salary }</c:when>
<c:otherwise> Don't know..</c:otherwise>
</c:choose>
<br>
<c:import var="data" url="https://www.google.co.in/" />
<c:out value="${data}" /> 
</body>
</html>