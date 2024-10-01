
<%@page import="com.utkarsh01.entity.ProjectEntity"%>
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
			document.frm.projectId.value = id;
			document.frm.action = "deleteProject";
			document.frm.method = "post";
			document.frm.submit();
		}
	}
	function editButton(id) {
		document.frm.projectId.value = id;
		document.frm.action = "editProject";
		document.frm.method = "post";
		document.frm.submit();
	}
</script>
</head>
<body>
	<div class="container">
		<h1>Project Management System</h1>
		<hr>
		<a href="addProDetails"><button class="btn btn-outline-success">Add New Project Details</button></a>
		<form name="frm" method="post">

			<input type="hidden" name="projectId">

			<table class="table table-striped-columns">
				<thead>
					<tr>
						<th>Project Id</th>
						<th>Project Name</th>
						<th>Project Type</th>
						<th>Project Budget</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<ProjectEntity> project=(List<ProjectEntity>)request.getAttribute("proKey");
					if (project.isEmpty()) {
					%>
					<tr>
						<td colspan="6">No Project Found</td>
					</tr>
					<%
					}
					for (ProjectEntity pro : project) {
					%>
					<tr>
						<td><%=pro.getProjectId()%></td>
						<td><%=pro.getProjectName()%></td>
						<td><%=pro.getProjectType()%></td>
						<td><%=pro.getProjectBudget()%></td>
						<td><input type="button" value="Edit"
							class="btn btn-outline-primary"
							onclick="editButton('<%=pro.getProjectId()%>')" /></td>
						<td><input type="button" value="Delete"
							class="btn btn-outline-danger"
							onclick="deleteButton('<%=pro.getProjectId()%>')" /></td>
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
