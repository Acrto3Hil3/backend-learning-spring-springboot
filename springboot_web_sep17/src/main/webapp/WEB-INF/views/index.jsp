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
<h1>JSTL Demo !!</h1>
<c:set var="salary" scope="application" value="${1000 }"/>
<c:set var="salary" scope="session"  value="${2300 }" />
<c:set var="salary" scope="request" value="${6000}"/>

<b>Application Salary : </b>
<c:out value="${applicationScope.salary }" /> <br>
<b> Session Salary : </b>
<c:out value="${sessionScope.salary }"/> <br>
 <b> Request Salary : </b>
<c:out value="${requestScope.salary }"/>
<a href="showValue">Show All Values</a>

</body>
</html>