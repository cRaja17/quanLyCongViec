<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sua Cong Viec</title>
</head>
<body>
	<form:form action="/qlvc/user/editJob/${job.id }" method="POST"
		modelAttribute="editJob">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Tên công
				việc</label>
			<form:input type="text" path="name" value="${job.name }"/>
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Địa điểm</label>
			<form:input type="text" path="address" value="${job.address }"/>

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Giá Tiền</label>
			<form:input type="number" path="price" value="${job.price }"/>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Mô tả</label>
			<form:input type="text" path="description" value="${job.description }"/>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Ngày
				bắt đầu</label>
			<form:input type="datetime-local" path="start_date" value="${job.start_date }"/>

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Ngày
				kết thúc</label>
			<form:input type="datetime-local" path="end_date" value="${job.end_date }"/>

		</div>
		<button type="submit" class="btn btn-primary">Sửa công việc</button>
	</form:form>
</body>
</html>