<%@page import="java.util.List"%>
<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<script>
	function deleteEmployee(id) {
		var status = confirm("Do you want to delete?");
		if (status) {
			document.frm.empId.value = id;
			document.frm.action = "deleteEmployee";
			document.frm.method = "post";
			document.frm.submit();
		}	
	}
	function editEmployee(id) {
		document.frm.empId.value = id;
		document.frm.action = "editEmployee";
		document.frm.method = "post";
		document.frm.submit();
	}
</script>
</head>
<body>
	<div class="container">
		<h1>Employee Management System</h1>
		<a href="addEmployee"><button class="btn btn-outline-success">Add New Employee</button></a>
		<form name="frm" >

			<input type="hidden" name="empId">

			<table class="table table-striped-columns">
			
			<%
			List<EmployeeDetails> employees = (List<EmployeeDetails>) request.getAttribute("employee");
			if(employees.isEmpty()){
			%>
				<%	
			}
			for (EmployeeDetails emp : employees) {
			%>
			<tr>
				<td><%=emp.getEmpId()%></td>
				<td><%=emp.getName()%></td>
				<td><%=emp.getDept()%></td>
				<td><%=emp.getSalary()%></td>
				<td><input type="button" value="Edit"
					onclick="editEmployee('<%=emp.getEmpId()%>')" /></td>
				<td><input type="button" value="Delete"
					onclick="deleteEmployee('<%=emp.getEmpId()%>')" /></td>
			</tr>
			<%
			}
			%>
			</table>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
