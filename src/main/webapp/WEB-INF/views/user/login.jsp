<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<c:url value="/assets/user/login.css"/>">
<title>NGƯỜI DÙNG ĐĂNG NHẬP</title>
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
	height: 600px;
	background-color: #fff;
	display: flex;
	align-items: center;
	justify-content: center;
}

.login {
	margin-top: 100px;
}

.signup {
	padding: 90px 75px;
	background-color: #fff;
	width: 100%;
	max-width: 600px;
	border-radius: 20px;
}

.signup-heading {
	font-size: 40px;
	font-weight: bold;
	color: #373941;
	text-align: center;
	margin-bottom: 35px;
}

.signup-label {
	display: inline-block;
	font-size: 16px;
	color: #373941;
	margin-bottom: 10px;
	cursor: pointer;
}

.signup-input {
	background-color: #fff;
	display: block;
	width: 100%;
	padding: 25px;
	background-color: #f2f3f5;
	border: 1;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	margin-bottom: 30px;
}

.signup-submit {
	padding: 25px;
	color: white;
	font-size: 20px;
	text-align: center;
	outline: none;
	display: block;
	width: 100%;
	background-color: black;
}

.signup-already {
	text-align: center;
}

.create-account {
	font-size: 16px;
	color: black;
	text-decoration: none;
}

.signup-submit:hover {
	background-color: white;
	color: #373941;
}
</style>
</head>
<body>
	<c:if test="${ not empty IdUsers }">
		<c:redirect url="/user/home" />
	</c:if>
	<c:if test="${ empty IdUsers }">
		<div class="login">
			<div class="signup">
				<form:form action="/qlvc/user/auth/login" method="POST"
					modelAttribute="loginUser">
					<h1 class="signup-heading">Người dùng đăng nhập</h1>
					<p style="color: red">${statusLogin}${statusRegister}</p>
					<label for="phone-number" class="signup-label">Số điện
						thoại</label>
					<form:input path="phone_number" type="number" id="phone-number"
						class="signup-input" />

					<label for="password" class="signup-label">Mật khẩu</label>
					<form:input path="password" type="password" id="password"
						class="signup-input" />


					<button type="submit" class="signup-submit">Đăng nhập</button>

				</form:form>
				<p class="signup-already">
					<a href="<c:url value="/user/auth/register" />"
						class="create-account">Đăng kí ?</a>
				</p>
			</div>

		</div>
	</c:if>

</body>
</html>
