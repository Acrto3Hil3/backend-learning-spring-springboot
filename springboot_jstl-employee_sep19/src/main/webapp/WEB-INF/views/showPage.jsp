<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="jakarta.tags.core" %>
    <%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Page</title>
</head>
<script type="text/javascript">
function editButton(eId){
	document.frm.id.value=eId
	document.frm.action="editEmp"
	document.frm.submit()
		
}

function deleteButton(eId){
	if(confirm("Do you want to delete ?")){
		document.frm.id.value=eId
		document.frm.action="deleteEmp"
		document.frm.submit()
	}
}
</script>
<body>
	<fmt:setBundle basename="label"/>
	<h1> <fmt:message key="employee.show-employee.header"/> </h1>
	<form action="" name="frm">
	<input type="hidden" name="id">
	<table border="3" width="100%">
		<tr>
	<td colspan="3"> <a href="addEmp"> <fmt:message key="employee.show-employee.add-employee.header"/> </a> </td>
		<td colspan="3" align="right"> <fmt:message key="employee.show-employee.date"/> <fmt:formatDate value="<%=new Date() %>" pattern="dd-MMM-yyyy"/> </td>
		</tr>
		<c:forEach var="empObj" items="${empKey }">
		<tr>
		<td>${empObj.id }</td>
		<td>${empObj.name }</td>
		<td>${empObj.position }</td>
		<td>${empObj.salary }</td>
		<td align="center"> <button onClick="editButton(${empObj.id })">Edit</button>   </td>
		<td align="center"> <button onClick="deleteButton(${empObj.id })">Delete</button> </td>
		
		</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>