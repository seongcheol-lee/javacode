<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ page session="false"%>

<html>

<head>
<link href="https://fonts.googleapis.com/css2?family=Song+Myung&display=swap" rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<title>식당 이름</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
</style>
</head>

<body>
	<!-- <div class="container-sm"> -->
	<meta charset="utf-8">
	<div style="width: 720px; height: auto; margin: 0px auto; background-color: #F5BCA9;">
		<nav class="navbar navbar-light">
			<a class="navbar-brand"></a>
			<form class="form-inline">
				<div>
					<a href="<c:url value='./updateform'/>"><button type="button"
							class="btn btn-warning">식당 정보 수정</button></a> <a
						href="<c:url value='./deleteform'/>"><button type="button"
							class="btn btn-danger">식당 삭제</button></a>
				</div>
			</form>
		</nav>
	</div>


	<!-- <div class="row text-center" style="width: 100%">
		<div style="width: 720px; float: none; margin: 0px auto">
			<nav class="navbar navbar-expand-lgs">
				<p style="font-size: 24px; text-align: center">식당 이름</p>
			</nav>
		</div>
	</div> -->

	<div class="card-deck">
		<table border="0">
			<tr>
				<td>
					<div class="card">
						<img src="<c:url value='/resources/img/happy.jpg' />"
							class="card-img-top" alt="...">
						<div class="card-body" style="background-color: #F8ECE0">
							<h5 class="card-title" style="font-family: 'Song Myung', serif; font-size: 28px" align="center">해피치즈스마일</h5>
							<p class="card-text" align="center">대구광역시 중구 삼덕동 227-6</p>
							<div class="card-footer" align="center" style="background-color: #F8ECE0">4.8/5.0</div>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</div>

	<br>
	<div class="tb_wrap">
		<div style="width: 720px; height: 60px; margin: 0px auto">
			<table class="table table-borderless">
				<thead>
					<tr class="fixed_top" style="position: absolute; background-color: #F5BCA9">
						<th scope="col" width="40px" style="margin: 0px auto">#</th>
						<th scope="col" width="260px" style="margin: 0px auto">메뉴</th>
						<th scope="col" width="220px" style="margin: 0px auto">가격</th>
						<th scope="col" width="60px" style="margin: 0px auto"></th>
						<th scope="col" width="140px" style="margin: 0px auto"><a
							href="<c:url value='./menu_createform'/>"><button
									type="button" class="btn btn-primary">메뉴 추가</button></a></th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<div
			style="width: 720px; height: 200px; overflow-y: scroll; overflow-x: hidden; margin: 0px auto">
			<table class="table table-borderless">
				<thead>
				</thead>
				<tbody>
					<tr>
						<th scope="row" width="40px">1</th>
						<td width="260px">메뉴1</td>
						<td width="220px">가격1</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_updateform'/>"><button
											type="button" class="btn btn-warning">수정</button></a>
								</div>
							</div>
						</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_deleteform'/>"><button
											type="button" class="btn btn-danger">삭제</button></a>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<th scope="row" width="40px">2</th>
						<td width="260px">메뉴2</td>
						<td width="220px">가격2</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_updateform'/>"><button
											type="button" class="btn btn-warning">수정</button></a>
								</div>
							</div>
						</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_deleteform'/>"><button
											type="button" class="btn btn-danger">삭제</button></a>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<th scope="row" width="40px">3</th>
						<td width="260px">메뉴3</td>
						<td width="220px">가격3</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_updateform'/>"><button
											type="button" class="btn btn-warning">수정</button></a>
								</div>
							</div>
						</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_deleteform'/>"><button
											type="button" class="btn btn-danger">삭제</button></a>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<th scope="row" width="40px">4</th>
						<td width="260px">메뉴4</td>
						<td width="220px">가격4</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_updateform'/>"><button
											type="button" class="btn btn-warning">수정</button></a>
								</div>
							</div>
						</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_deleteform'/>"><button
											type="button" class="btn btn-danger">삭제</button></a>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<th scope="row" width="40px">5</th>
						<td width="260px">메뉴5</td>
						<td width="220px">가격5</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_updateform'/>"><button
											type="button" class="btn btn-warning">수정</button></a>
								</div>
							</div>
						</td>
						<td>
							<div class="row">
								<div class="col text-center">
									<a href="<c:url value='./menu_deleteform'/>"><button
											type="button" class="btn btn-danger">삭제</button></a>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<br>
	<div style="width: 720px; height: 400px; margin: 0px auto">
		<div id="carouselExampleCaptions" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleCaptions" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
				<li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="<c:url value='/resources/img/wp1.jpg'/>"
						class="d-block w-100" alt="..." width="400px" height="350px">
					<div class="carousel-caption d-none d-md-block">
						<h5>메뉴1</h5>
						<p>가격1 / 평점1</p>
						<p>후기 블라블라 멍멍멍</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="<c:url value='/resources/img/wp2.jpg'/>"
						class="d-block w-100" alt="..." width="400px" height="350px">
					<div class="carousel-caption d-none d-md-block">
						<h5>메뉴2</h5>
						<p>가격2 / 평점2</p>
						<p>후기 블라블라 멍멍멍</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="<c:url value='/resources/img/wp3.jpg'/>"
						class="d-block w-100" alt="..." width="400px" height="350px">
					<div class="carousel-caption d-none d-md-block">
						<h5>메뉴3</h5>
						<p>가격3 / 평점3</p>
						<p>후기 블라블라 멍멍멍</p>
					</div>
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleCaptions"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleCaptions"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<!-- </div> -->
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