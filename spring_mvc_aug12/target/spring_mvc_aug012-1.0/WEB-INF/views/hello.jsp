<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Page</title>
</head>
<body>
	<h1>Hello World</h1>
	<b>Institute Name : </b><%=request.getAttribute("abc")%>
	</br>

	<b>Today's Date : </b><%=request.getAttribute("xyz")%>
	</br>
</body>
</html>