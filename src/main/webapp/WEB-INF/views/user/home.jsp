<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach cong viec cua ban</title>
</head>
<body>
	<c:if test="${ not empty IdUsers }">
		<a href="<c:url value="/user/auth/logout" />">đăng xuất</a>

		<a href="<c:url value="/user/createJob"/>">them cong viec</a>
		<table class="table" style="border: 1px solid black">
			<thead>
				<tr>
					<th scope="col" style="border: 1px solid black">id</th>
					<th scope="col" style="border: 1px solid black">name</th>
					<th scope="col" style="border: 1px solid black">price</th>
					<th scope="col" style="border: 1px solid black">chi tiet</th>
					<th scope="col" style="border: 1px solid black">address</th>
					<th scope="col" style="border: 1px solid black">ngaytao</th>
					<th scope="col" style="border: 1px solid black">ngay bat dau</th>
					<th scope="col" style="border: 1px solid black">ngay ket thuc</th>
					<th scope="col" style="border: 1px solid black">User id</th>
					<th scope="col" style="border: 1px solid black"></th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${job}" varStatus="index">
					<tr>
						<td style="border: 1px solid black">${item.id}</td>
						<td style="border: 1px solid black">${item.name}</td>
						<td style="border: 1px solid black">${item.price}</td>
						<td style="border: 1px solid black">${item.description}</td>
						<td style="border: 1px solid black">${item.address}</td>
						<td style="border: 1px solid black">${item.create_at}</td>
						<td style="border: 1px solid black">${item.start_date}</td>
						<td style="border: 1px solid black">${item.end_date}</td>
						<td style="border: 1px solid black">${item.user_id}</td>
						<td style="border: 1px solid black"><a
							href="<c:url value="/user/Jobdetail/${item.id}"/>">Xem thông tin</a> <a
							href="<c:url value="/user/editJob/${item.id}"/>">sửa</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</c:if>
	<c:if test="${ empty IdUsers }">
		<c:redirect url="/user/auth/login" />
	</c:if>
</body>
</html>