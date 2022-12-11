<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="create_acc.css">
<title>NGƯỜI DÙNG ĐĂNG KÍ</title>
<style>
html {
	font-size: 62, 5%;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

* {
	box-sizing: border-box;
}

body {
	width: auto;
	height: 100%;
	background-color: #fff;
	display: flex;
	align-items: center;
	justify-content: center;
}

.login {
	margin-top: 100px;
}

.create-account {
	padding: 90px 75px;
	background-color: #fff;
	width: 100%;
	max-width: 600px;
	border-radius: 20px;
}

.create-heading {
	font-size: 40px;
	font-weight: bold;
	color: #373941;
	text-align: center;
	margin-bottom: 35px;
}

.create-label {
	display: inline-block;
	font-size: 16px;
	color: #373941;
	margin-bottom: 10px;
	cursor: pointer;
}

.create-input {
	background-color: #fff;
	display: block;
	width: 100%;
	padding: 25px;
	background-color: #f2f3f5;
	border: 1;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	margin-bottom: 30px;
}

.create-submit {
	padding: 25px;
	color: white;
	font-size: 20px;
	text-align: center;
	outline: none;
	display: block;
	width: 100%;
	background-color: black;
}

.create-already {
	text-align: center;
}

.login-account {
	font-size: 16px;
	color: rgb(109, 39, 39);
	text-decoration: none;
}

.create-submit:hover {
	background-color: white;
	color: #373941;
}
</style>
</head>
<body>
	<div class="login">
		<div class="create-account">
			<h1 class="create-heading">Người dùng đăng kí tài khoản</h1>
			<form:form action="/qlvc/user/auth/register" method="POST"
				modelAttribute="registerUser">

				<label for="name" class="create-label">Họ và Tên</label>
				<form:input type="text" path="name" id="name" class="create-input" />

				<label for="name" class="create-label">Địa chỉ</label>
				<form:input type="text" path="address" id="name"
					class="create-input" />

				<label for="phone-number" class="create-label">Số Điện Thoại</label>
				<form:input type="number" path="phone_number" id="phone-number"
					class="create-input" />

				<label for="phone-number" class="create-label">CCCD</label>
				<form:input type="number" path="identify_card" id="phone-number"
					class="create-input" />

				<label for="password" class="create-label">Mật khẩu</label>
				<form:input type="password" id="password" class="create-input"
					path="password" />
				<button type="submit" class="create-submit">Tạo tài khoản</button>
			</form:form>

			<p class="create-already">
				<span>Bạn đã có tài khoản ? </span> <a href="<c:url value="/user/auth/login"/>"
					class="login-account">Đăng nhập</a>
			</p>
		</div>

	</div>
</body>
</html>