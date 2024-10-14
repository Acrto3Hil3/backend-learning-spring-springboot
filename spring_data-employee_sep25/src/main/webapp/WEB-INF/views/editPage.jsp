<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE PAGE</title>
</head>
<body>
<fmt:setBundle basename="label" var="lb"/>
<h1>Update Employee Details</h1>
<frm:form modelAttribute="employee" action="updateEmp" method="post">
<frm:hidden path="id"/>
<b> ${employee.id} </b>
	<table border="3">
	<tr>
	<td> <fmt:message key="employee.name" bundle="${lb}"/> </td>
	<td> <frm:input path="name"/> </td>
	</tr>
	<tr>
	<td> <fmt:message key="employee.address" bundle="${lb}"/> </td>
	<td> <frm:input path="address"/> </td>
	</tr>
	<tr>
	<td> <fmt:message key="employee.mobile" bundle="${lb}"/> </td>
	<td> <frm:input path="mobile"/> </td>
	</tr>
	<tr>
	<td> <fmt:message key="employee.salary" bundle="${lb}"/> </td>
	<td> <frm:input path="salary"/> </td>
	</tr>
	
	<tr>
	<td align="left" > <input type="submit" value="Update"> </td>
	<td align="right" > <a href="showAll">  <button type="button">Cancel</button>  </a> </td>
	</tr>
	</table>
</frm:form>
</body>
</html>