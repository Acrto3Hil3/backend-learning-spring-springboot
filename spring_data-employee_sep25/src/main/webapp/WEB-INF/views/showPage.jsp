<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMS</title>
<script type="text/javascript">
function editButton(eId){
	document.frm.id.value=eId
	document.frm.action="editEmp"
	document.frm.submit()
}

function deleteButton(eId){
	if(confirm("Do you want to delete??")){
		document.frm.id.value=eId
		document.frm.action="deleteEmp"
		document.frm.submit()
	}
}

function searchButton(){
	var eSearchName=document.frm.name.value
	document.frm.name.value=eSearchName
	document.frm.action="searchEmp"
	document.frm.submit()
}
</script>

</head>
<body>
<fmt:setBundle basename="label"  var="lb"/>
<h1><fmt:message key="employee.show.header"/></h1>
<a href="addEmp"> <button> <fmt:message key="employee.show-employees.add-employee.header" /> </button> </a>
<form name="frm">
 <input type="hidden" name="id">
 <input type="hidden" name="name">
 
 <table border="3">
 	<tr> 
 		<td align="left" colspan="4">Name :  <input name="name"> <button onclick="searchButton()">Search</button> </td>
 		<td align="right" colspan="7" > <b> <fmt:message key="employee.show-employees.date" /> </b> <fmt:formatDate value="<%=new Date() %>" pattern="dd-MMM-YYYY"/> </td>
 </tr>
 
 <tr>
 
 </tr>
 <c:forEach items="${empKey }" var="e">
 <tr>
 <td>${e.id}</td>
 <td>${e.name}</td>
 <td>${e.address}</td>
 <td>${e.mobile}</td>
 <td>${e.salary}</td>
 <td align="center"> <button onclick="editButton(${e.id})">Edit</button> </td>
 <td align="center"> <button onclick="deleteButton(${e.id})">Delete</button> </td>
 </tr>

 </c:forEach>
  </table>
</form>
</body>
</html>