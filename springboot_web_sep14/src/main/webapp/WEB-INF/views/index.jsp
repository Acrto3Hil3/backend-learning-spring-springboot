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
<h1> <c:out value="Spring Boot Demo!!"/> </h1>
<b>Today Date : </b> <c:out value="${todayKey }"/> <br>
<c:forEach var="count" begin="1" end="10" >
	<b>Hello world.. <c:out value="${count }"/><br> </b>
</c:forEach>
<c:set var="income" value="${4000*2 }"/>
<c:out value="${income }"/>
</body>
</html>