
<%@page import="com.utkarsh01.entity.EmployeeDetails"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<script>
	function deleteButton(id) {
		var status = confirm("Do you want to delete?");
		if (status) {
			document.frm.empId.value = id;
			document.frm.action = "deleteEmp";
			document.frm.method = "post";
			document.frm.submit();
		}
	}
	function editButton(id) {
		document.frm.empId.value = id;
		document.frm.action = "editEmp";
		document.frm.method = "post";
		document.frm.submit();
	}
</script>
</head>
<body>
	<div class="container">
		<h1>Employee Management System</h1>
		<hr>
		<a href="addEmp"><button class="btn btn-outline-success">Add
				New Employee</button></a>
		<form name="frm" method="post">

			<input type="hidden" name="empId">

			<table class="table table-striped-columns">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Department</th>
						<th>Salary</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<EmployeeDetails> employees = (List<EmployeeDetails>) request.getAttribute("employee");
					if (employees.isEmpty()) {
					%>
					<tr>
						<td colspan="6">No Employees Found</td>
					</tr>
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
							class="btn btn-outline-primary"
							onclick="editButton('<%=emp.getEmpId()%>')" /></td>
						<td><input type="button" value="Delete"
							class="btn btn-outline-danger"
							onclick="deleteButton('<%=emp.getEmpId()%>')" /></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
