<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ page session="false"%>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Song+Myung&display=swap"
	rel="stylesheet">
<title>한끼의 품질</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<style>
body {
	background-color: #F8ECE0;
	margin: 0
}

th, td {
	padding: 15px;
}

table {
	margin-left: auto;
	margin-right: auto;
	border-spacing: 20px;
}

[class*="col"] {
	padding: 8px;
	border: 1px solid gray;
	text-align: center;
}
</style>
</head>

<body>
	<nav class="navbar navbar-light "
		style="color: #FFFFFF; background-color: #F5BCA9">
		<div class="container">
			<div class="row text-center" style="width: 100%">
				<div style="float: none; margin: 0px auto">
					<nav class="navbar navbar-expand-lgs">
						<p
							style="font-size: 72px; font-family: 'Black Han Sans', sans-serif"
							align="center">한끼의 품질</p>
					</nav>
				</div>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row row-cols-3">
			<div class="col">
				<td>
					<div class="card" style="padding-top: 10px; background-color: rgba( 255, 255, 255, 0.5 );">
						<a href="<c:url value='/detail/list'/>"> <img
							src="/myapp/resources/img/happy.jpg"
							style="width: 300px; height: auto; max-width: 100%;" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">해피치즈스마일</h5>
							<p class="card-text" align="center">대구광역시 중구 삼덕동 227-6</p>
							<div class="card-footer" align="center">4.8/5.0</div>
							<!-- style="color: #FE2E2E; font-size: 15px" -->
						</div>
					</div>
				</td>
			</div>
			<div class="col">column2</div>
			<div class="col">column3</div>
			<div class="col">column4</div>
		</div>
	</div>

	<div class="card-deck">
		<table border="1">
			<tr>
				<td style="background-color: #FAEDED">
					<div class="card">
						<a href="<c:url value='/detail/list'/>"> <img
							src="/myapp/resources/img/happy.jpg"
							style="width: 300; height: auto;" class="card-img-top" alt="..."></a>
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">해피치즈스마일</h5>
							<p class="card-text" align="center">대구광역시 중구 삼덕동 227-6</p>
							<div class="card-footer" align="center">4.8/5.0</div>
							<!-- style="color: #FE2E2E; font-size: 15px" -->
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<img src="/myapp/resources/img/corea.jpg"
							style="width: 300; height: auto;" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">코레아 경양식</h5>
							<p class="card-text" align="center">대구광역시 중구 대봉동 3-14</p>
							<div class="card-footer" align="center">4.0/5.0</div>
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<img src="/myapp/resources/img/tokyo.jpg"
							style="width: 300; height: auto;" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">도쿄다이닝</h5>
							<p class="card-text" align="center">대구광역시 중구 봉산동 4-5 동성로2길</p>
							<div class="card-footer" align="center">4.0/5.0</div>
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="card">
						<img src="/myapp/resources/img/don.jpg"
							style="width: 300; height: auto;" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">은화수식당</h5>
							<p class="card-text" align="center">대구광역시 북구 산격동 대동로6길 38</p>
							<div class="card-footer" align="center">4.8/5.0</div>
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<img src="/myapp/resources/img/ma.jpg"
							style="width: 300; height: auto;" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">도마29</h5>
							<p class="card-text" align="center">대구광역시 중구 봉산동 35-62</p>
							<div class="card-footer" align="center">4.0/5.0</div>
						</div>
					</div>
				</td>
				<td>
					<div class="card">
						<img src="/myapp/resources/img/sapa.png"
							style="width: 300; height: auto;" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"
								style="font-family: 'Song Myung', serif; font-size: 28px"
								align="center">사파키친</h5>
							<p class="card-text" align="center">대구광역시 동구 신천4동 425-1</p>
							<div class="card-footer" style="" align="center">4.0/5.0</div>
						</div>
					</div>
				</td>
			</tr>
		</table>

		<div class="btn btn-secondary btn-lg active"
			style="color: #F8ECE0; position: fixed; right: 120px; bottom: 50px; width: 50px; height: 50px; background-color: rgba( 255, 255, 255, 0 ); border-radius: 50%; border: 0px"
			role="button" aria-pressed="true">
			<a href="<c:url value='/detail/menu_createform'/>"> <img
				src="/myapp/resources/img/create.png"
				style="width: 70px; height: auto" class="card-img-top" alt="..."></a>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>