<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem Cong Viec</title>
</head>
<body>

		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Tên công
				việc : "${job.name }"</label>
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Địa điểm :
				${job.address }</label>

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Giá Tiền :
				${job.price }</label>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Mô tả :
				${job.description }</label>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Ngày
				bắt đầu : ${job.start_date }</label>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Ngày
				kết thúc : ${job.end_date }</label>

		</div>

</body>
</html>