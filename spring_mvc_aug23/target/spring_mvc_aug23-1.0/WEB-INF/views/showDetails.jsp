<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.utkarsh01.model.EmployeeDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<h1>Employees Management System</h1> <hr>

<form action="frm">
<table class="table table-hover">
<% List<EmployeeDetails> emp= (List<EmployeeDetails>) request.getAttribute("employee");
%>
<%
for(EmployeeDetails e:emp){
	

%>
	<tr>
	<td>${e.empId}</td>
	<td>${e.name }</td>
	<td>${e.dept }</td>
	<td>${e.salary }</td>
	<td><input type="button" class="btn btn-outline-warninng" value="Edit" onclick="editDetails('${e.empId}')"></td>
	<td> <input type="button" class="btn btn-outline-danger" value="Delete" onclick="deleteDetails('${e.empId}')" > </td>
	</tr>
	<%
	}
	%>
</table>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script type="text/javascript">

function editDetails(id){
	document.frm.empId.value=id;
	document.frm.action="editTarget";
	document.frm.method="post";
	document.frm.submit();
}

function deleteDetails(id){
	var status=confirm("Do you really want to delete?")
	if(status){
		document.frm.empId=id
		document.frm.action="deleteTarget"
		document.frm.method="post"
		document.frm.submit()
	}
}

</script>
</body>
</html>