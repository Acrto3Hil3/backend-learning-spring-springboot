<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<h1>Employees Management System</h1>
	<hr>
	<a href="addEmp">
		<button class="btn btn-outline-success">add Employees</button>
	</a>
	<hr>

	<form name="frm ">

		<table class="table table-hover ms-2 me-2">
			<%
        List<EmployeeDetails> employeeData= (List<EmployeeDetails> )  request.getAttribute("employee");
	
        if(employeeData.isEmpty()){
        	out.print("l");
       
        %>
			<tr>
				<td colspan="6">No Employees Data Found!!</td>
			</tr>
			<%
			}
			%>

			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Department</th>
					<th>Salary</th>
					<th>Update</th>
					<th>Remove</th>
				</tr>
			</thead>
			<tbody>
		<%
         for(EmployeeDetails e:employeeData){
         
        %>
				<tr>
					<td><%=e.getEmpId() %></td>
					<td> <%=e.getName() %></td>
					<td> <%=e.getDept() %></td>
					<td> <%=e.getSalary() %></td>
					<td><input type="button" class="btn btn-outline-warning"
						value="Edit" onclick="editDetails('${e.empId}')"></td>
					<td><input type="button" class="btn btn-outline-danger"
						value="Delete" onclick="deleteDetails('${e.empId}')"></td>
				</tr>
			
			</tbody>
			<%
         }
			%>
		</table>
	</form>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script type="text/javascript">
		function editDetails(id) {
			document.frm.empId.value = id;
			document.frm.action = "editTarget";
			document.frm.method = "post";
			document.frm.submit();
		}

		function deleteDetails(id) {
			var status = confirm("Do you really want to delete?")
			if (status) {
				document.frm.empId = id
				document.frm.action = "deleteTarget"
				document.frm.method = "post"
				document.frm.submit()
			}
		}
	</script>
</body>
</html>