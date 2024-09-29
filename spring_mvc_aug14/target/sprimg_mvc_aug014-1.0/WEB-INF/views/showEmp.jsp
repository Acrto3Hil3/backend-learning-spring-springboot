<%@page import="java.util.List"%>
<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="https://jakarta.ee/jstl/core" prefix="c" %>
<%@ taglib uri="https://jakarta.ee/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Details</title>
</head>
<body>
	<h1>Employee Details </h1>
	<table border="4" width="90%">
		<%
		List<EmployeeDetails> emp=(List<EmployeeDetails>)request.getAttribute("employee");
		for(EmployeeDetails e:emp){
		%>
		
		<tr> 
			<td><%=e.getEmpId() %></td>
			<td><%=e.getName() %></td>
			<td><%=e.getDept() %></td>
			<td><%=e.getSalary() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>