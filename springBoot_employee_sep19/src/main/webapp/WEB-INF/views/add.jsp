<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>  
 <%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD PAGE</title>
</head>
<body>
	<fmt:setBundle basename="label" var="lab"/>
	<h1>Add Employee</h1>
	<frm:form modelAttribute="employee" action="saveEmp" method="post">
	<frm:hidden path="id"/>
	<table border="3" width="100%">
		<tr>
			<td> <fmt:message key="employee.name" bundle="${lab}" /> </td>
			<td> <frm:input path="name"/> </td>
		</tr>
		<tr>
			<td> <fmt:message key="employee.position" bundle="${lab}" /> </td>
			<td> <frm:input path="position"/> </td>
		</tr>
		<tr>
			<td> <fmt:message key="employee.salary" bundle="${lab}" /> </td>
			<td> <frm:input path="salary"/> </td>
		</tr>
		<tr>
			<td colspan="3">  <input type="submit" value="Save "> </td>
			<td> <a href="showEmp"><button>Cancel</button></a>  </td>
		</tr>
	</table>
	</frm:form>
</body>
</html>