<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h2 class="text-center">Update Employee Details</h2>
	<frm:form action="updateEmp" method="post" class="container d-flex mt-3 form-control " modelAttribute="empKey">
		<div class="w-25 mx-auto border p-3">
			<div class="form-floating mt-1">
			<frm:input type="hidden" path="empId" />
				<frm:input type="text" class="form-control" path="name"/>
				<label class="form-label">Name</label>
			</div>
			<div class="form-floating mt-3">
				<frm:input type="text" class="form-control" path="dept" />
				<label class="form-label">Department</label>
			</div>
			<div class="form-floating mt-3">
				<frm:input type="text" class="form-control"  path="salary"/>
				<label class="form-label">Salary</label>
			</div>
			<div class=" d-flex justify-content-around mt-3">
				<div class="form-floating ">
					<input type="submit"
						class="text-center btn btn-outline-warning form-label" value="Add">
				</div>
				
				<div class="form-floating ">
					<a href="showEmp"><input type="button"
						class="text-center btn btn-outline-danger form-label" value="Cancel"> </a>
				</div>
			</div>
		</div>
	</frm:form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>