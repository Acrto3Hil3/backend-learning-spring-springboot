<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page For Sprig MVC</h1>
<% String name=(String)request.getAttribute("name");
java.util.Date date01 = (java.util.Date) request.getAttribute("date1");
	Integer rollNo=(Integer)request.getAttribute("rollno");
%>
<h3>Name : <%=name %></h3>
<h3>Date : <%= date01 %></h3>
<h3>Roll No : <%= rollNo %></h3>
</body>
</html>