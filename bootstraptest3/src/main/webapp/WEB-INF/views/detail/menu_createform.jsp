<%@ page contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 추가</title>
</head>
<body>
	<h1>메뉴 추가</h1>
	<form action="./update" method="post">
		<table border="1">
			<tr>
				<th>이름</th>
				<td><input type="number" name="employeeId"
					value="${emp.employeeId}" readonly></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="firstName"
					value="${emp.firstName}"></td>
			</tr>

			<tr>
				<th>&nbsp;</th>
				<td><input type="submit" value="추가"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>
