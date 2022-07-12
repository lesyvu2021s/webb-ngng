<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
}
td {
  padding-right: 30px;
}
</style>
</head>
<body>
	
	<c:url value="/orders-update/" var="urlUpdate" ></c:url>
	<c:url value="/deleteOrders/" var="urlDelete"></c:url>
	<h1>List Orders</h1>
	<table>
		<tr>
			<th>Stt</th>
			<th>ProductName</th>
			<th>CustomerCode</th>
			<th>Number</th>
			<th>Price</th>
			<th>TotalPrice</th>
			<th>Edit</th>
		</tr>
	
	<c:if test="${not empty listOrders}">
		<c:forEach items="${listOrders}" var="listOrders"  >
			 
		<tr>
			<td>${listOrders.orderCode}</td>
			<td>${listOrders.product.prodCode}</td>
			<td>${listOrders.customer.custCode}</td>
			<td>${listOrders.number}</td>
			<td>${listOrders.product.price}</td>
			<td>${listOrders.number * listOrders.product.price}</td>
			<td><a href="${urlUpdate}/${listOrders.orderCode}">Edit</a></td>
		</tr>
				
		</c:forEach>

	</c:if>
	
	</table>
</body>
</html>