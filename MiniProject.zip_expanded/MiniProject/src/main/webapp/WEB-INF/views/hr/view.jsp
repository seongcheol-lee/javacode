<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CoderBy</title>
</head>
<body>
<h1>사원 정보 상세 조회</h1>
<table border="1">
<tr>
	<th>음식 ID</th>
	<td>${emp.id}</td>
</tr>
<tr>
	<th>가게 ID</th>
	<td>${emp.store_id}</td>
</tr>
<tr>
	<th>음식 이름</th>
	<td>${emp.name}</td>
</tr>
<tr>
	<th>음식 가격</th>
	<td>${emp.cost}</td>
</tr>
</table>
<a href="update?empid=${emp.id}">수정하기</a> 
<a href="delete?empid=${emp.id}">삭제하기</a>
</body>
</html>