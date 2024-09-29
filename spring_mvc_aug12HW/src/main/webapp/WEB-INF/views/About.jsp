<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>
</head>
<body>
<h1>This is About Us Page</h1>
<%String address=(String)request.getAttribute("info");
%>
<h2>Address : </h2> <%=address %>
</body>
</html>