<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<h1>Existing Employee Form</h1>
		<%
		EmployeeDetails empObject = (EmployeeDetails) request.getAttribute("employee");
		%>
		<form action="updateEmployee" class="form-control" method="post">
			<input type="hidden" name="empId" value="<%=empObject.getEmpId()%>" />
			<label class="form-label">Enter Employee Name</label> <input
				type="text" name="name" class="form-control"
				value="<%=empObject.getName()%>" /> <label class="form-label">Department</label>
			<input type="text" value="<%=empObject.getDept()%>"
				class="form-control" name="dept"> <label class="form-label">Salary</label>
			<input type="number" name="salary" class="form-control"
				value="<%=empObject.getSalary()%>" /> <br> <input
				type="submit" value="ADD" class="text-center"> <a
				href="getAllEmployees"> <input type="button" value="Cancel">
			</a>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>