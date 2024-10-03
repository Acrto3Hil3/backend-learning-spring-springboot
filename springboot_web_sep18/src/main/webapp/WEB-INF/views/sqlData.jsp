<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="jakarta.tags.sql"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello sql data</h1>
	<sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver"
		user="root" password="1234"
		url="jdbc:mysql://localhost/springpractise" />
	<sql:query dataSource="${dataSource}" var="rs">
		select * from employee
	</sql:query>
	<table border="4">

		<c:forEach items="${rs.rows}" var="row">
			<tr>
				<td><c:out value="${row.empId}" /></td>
				<td><c:out value="${row.eName}" /></td>
				<td><c:out value="${row.eDesg}" /></td>
				<td><c:out value="${row.eSal}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>