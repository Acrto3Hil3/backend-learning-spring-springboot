<%@page import="java.util.List"%>
<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


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
		document.frm.empId.value = id;
		document.frm.action = "deleteEmp";
		document.frm.method = "post";
		document.frm.submit();
	}
</script>
</head>
<body>
	<div class="container">
		<h1>Employee Details</h1>
		<a href="addEmp"><button>Add New Employee</button> </a>
		<form name="frm">

			<input type="hidden" name="empId">

			<table class="table table-light ">
				<%
				List<EmployeeDetails> emp = (List<EmployeeDetails>) request.getAttribute("employee");

				for (EmployeeDetails e : emp) {
				%>
				<tr>
					<td><%=e.getEmpId()%></td>
					<td><%=e.getName()%></td>
					<td><%=e.getDept()%></td>
					<td><%=e.getSalary()%></td>
					<td><input type="button" value="Edit" class="form-control" /></td>
					<td><input type="button" value="Delete" class="form-control"
						onclick="deleteEmployee('<%=e.getEmpId()%>')" /></td>
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
