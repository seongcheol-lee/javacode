<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CoderBy</title>
</head>
<body>
<h1>음식 목록</h1>
<a href="<c:url value='/hr/insert'/>">신규 음식 등록</a>
<table border="1">
<tr>
	<th>음식 ID</th>
	<th>가게 ID</th>
	<th>음식 이름</th>
	<th>음식 가격</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr>
	<td><a href="<c:url value='/hr/${emp.id}'/>">${emp.id}</a></td>
	<td>${emp.store_id}</td>
	<td>${emp.name}</td>
	<td>${emp.cost}</td>
</tr>
</c:forEach>
</table>
</body>
</html>