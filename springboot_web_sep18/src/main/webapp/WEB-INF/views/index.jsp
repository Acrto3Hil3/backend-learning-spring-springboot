<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTLFormatig Tags Demo!!</h1>
	<c:set var="date" value="<%=new Date()%>" />
	<fmt:formatDate value="${date}" pattern="dd-MMM-yyy" />
	<c:set var="balamce" value="12022120.235" />
	<br>

	<fmt:setLocale value="en_HK" />
	<fmt:formatNumber value="${balance}" type="currency" />
	<fmt:parseNumber var="parsedValue" value="${balance}"
		integerOnly="true" type="number" />
	<br>

	<c:out value="${parsedValue}" />
	<c:set var="now" value="18-09-2022" />
	<fmt:parseDate value="${now}" pattern="dd-MM-yyy" var="today" />
	<br>
	<fmt:formatDate value="${today}" dateStyle="long" />
	<br>

	<fmt:setBundle basename="labels" var="lb" />

	<table border="1">
		<tr>
			<td><fmt:message key="user.first.name" bundle="${lb}" /></td>
			<td><input /></td>
		</tr>
		<tr>
			<td><fmt:message key="user.last.name" bundle="${lb}" /></td>
			<td><input /></td>
		</tr>
	</table>
	<a href="rsult"> Show Result</a>
	<c:set var="sentence" value="Hello User..." />
	<c:if test="${fn:contains(sentence,'user')}">
		<c:out value="${sentence }"/>
	</c:if>
</body>
</html>