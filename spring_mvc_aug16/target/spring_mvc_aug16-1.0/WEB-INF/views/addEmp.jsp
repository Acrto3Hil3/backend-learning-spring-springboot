<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add EMployee Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid" width="50vw" heigth="50vh">
		<form action="saveEmp" class="form-control" method="post">
			<label class="form-label">Enter the Employee Id </label> <input
				type="number" class="form-control" name="empId" /> <label
				class="form-label">Enter Employee Name</label> <input type="text"
				name="name" class="form-control"> <label class="form-label">Department</label>
			<input type="text" class="form-control" name="dept"> <label
				class="form-label">Salary</label> <input type="number" name="salary"
				class="form-control"> <br> <input type="submit"
				value="ADD" class="text-center">
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>