<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
<link rel="stylesheet" href="work_update.css">
<title>Danh sách công việc</title>
<style>
body {
	height: 100%;
}

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

a {
	text-decoration: none;
}

header {
	background-color: black;
}

.image_logo {
	background-color: rgb(152, 173, 190);
	width: 150px;
}

ul {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px 20px 20px 10px;
}

header ul li, a {
	color: white;
}

header ul li:nth-child(2) {
	position: relative;
}

header ul li:nth-child(2) input {
	height: 30px;
	width: 300px;
	border-radius: 20px;
	border: 0;
	outline: none;
	padding-left: 10px;
}

header ul li:nth-child(2) i {
	position: absolute;
	font-size: 15px;
	right: 12px;
	color: black;
	line-height: 30px;
	cursor: pointer;
}

/*--------footer-----------*/
footer table {
	background-color: rgb(109, 101, 101);
	width: 100%;
	max-height: 200px;
	letter-spacing: 0.5px;
	padding: 0;
}

footer table, th, td {
	border-top: 1px solid rgb(109, 101, 101);
	border-bottom: 1px solid #ccc;
}

footer table {
	border-collapse: collapse;
}

.img_job {
	width: 150px;
}

footer tr {
	cursor: pointer;
}

footer img {
	width: 200px;
}
</style>
</head>
<body>
	<c:if test="${ not empty IdMember }">
		<header>
			<ul>
				<li><a href=""><img src="./img/logo.png" class="image_logo"
						alt="Trang chủ"></a></li>
				<li><p>${IdMember.name} </p><a href="<c:url value="/member/auth/logout"/>" style="color:red">Đăng xuất</a></li>
				<li><input type="text" placeholder="Tìm kiếm công việc"><i
					class="fa-sharp fa-solid fa-magnifying-glass"></i></li>
			</ul>

		</header>
		<footer>
			<table border="1" class="content_table">
				<c:forEach var="job" items="${jobs}" varStatus="index">

					<tr>
						<th class="img_job"><a href="<c:url value="/member/detail/${job.id }"/>"> <img src="./img/dog.png"
								alt="">
						</a></th>
						<a href="<c:url value="/member/detail/${job.id }"/>"> </a>
						<th><a href="">
								<h1>${job.name}</h1> <br> <br> <br>
								<p>${job.address}</p>
								<p>
									<i class="fa-solid fa-clock"></i> Thời gian: ${job.create_at}
								</p>

						</a></th>
						<th><a href="<c:url value="/member/detail/${job.id }"/>"> <i class="fa-solid fa-calendar-check"></i>
								${job.start_date} đến ${job.end_date} <br> <br>
								<p>${job.price}</p>
						</a></th>
					</tr>
				</c:forEach>
			</table>
		</footer>
	</c:if>
	<c:if test="${ empty IdMember }">
		<c:redirect url="/member/auth/login" />
	</c:if>
</body>
</html>