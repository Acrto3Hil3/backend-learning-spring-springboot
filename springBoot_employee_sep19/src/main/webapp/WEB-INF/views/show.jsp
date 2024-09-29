<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function deleteEmp(eId) {
    if (confirm("Do you really want to delete ??")) {
        document.frm.id.value = eId;
        document.frm.action = "deleteDetails";
        document.frm.submit();
    }
}
</script>

</head>
<body>
	<h1>Employees Details</h1>

	<form action="" name="frm">
		<input type="hidden" name="id">
		<table border="2" width="100%">
			<tr>
				<td align="right" colspan="6"><b>Date :</b> <fmt:formatDate
						value="<%=new Date()%>" pattern="dd-MM-yyyy" /></td>
			</tr>
			<c:forEach items="${empKey}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.firstName}</td>
					<td>${emp.lastName}</td>
					<td>${emp.address}</td>
					<td>${emp.mobile}</td>
					<td>${emp.salary}</td>
					<td align="center">
						<button type="button" onclick="editEmp(${emp.id})">Edit</button>
					</td>
					<td align="center">
						<button type="button" onclick="deleteEmp(${emp.id})">Delete</button>
					</td>

				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>