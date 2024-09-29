<%@page import="java.util.List"%>
<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Details</title>
</head>
<body>
	<h1>Employee Details </h1>
	<table border="4" width="90%">
	<%EmployeeDetails emp=(EmployeeDetails) request.getAttribute("employee"); %>
		
		<c:forEach var="e" items="${employee}">
        <tr>
            <td>${e.empId}</td>
            <td>${e.name}</td>
            <td>${e.dept}</td>
            <td>${e.salary}</td>
            <td> <input type="button" value="Edit" ></td>
            <td><input type="button" value="Delete" onclick="deleteEmp('<%=emp.getEmpId()%>')" > </td>
        </tr>
    </c:forEach>
	</table>
</body>
</html>