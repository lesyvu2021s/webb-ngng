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
	
	<c:url value="/product-update/" var="urlUpdate" />
	<c:url value="/deleteProduct/" var="urlDelete" />
	<c:url value="/orders/"  var="urlOrder"></c:url>
	<h1>danh sach hien thi san pham</h1>
	

	<form action='<c:url value ="/product/search" ></c:url>'>
		<input type="text" placeholder="Enter text to Search" name="txt">
		<button >Find</button>
	</form>
	<br/>
	<a href="<c:url value="/customer-list" />" >List Customer</a> <br />
	<a href='<c:url value ="/product-save" ></c:url>'>Add Product</a> <br/>
	<table>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
			<th>Orders</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>

		<c:if test="${not empty listProduct }">
			<c:forEach items="${listProduct}" var="listProduct">
				<tr style="border: 1px black solid">
					<td>${listProduct.prodCode}</td>
					<td>${listProduct.name}</td>
					<td>${listProduct.price}</td>
					<td><a href="${urlOrder}/${listProduct.prodCode}">Order</a></td>
					<td><a href="${urlDelete}/${listProduct.prodCode}" title="delete"
					 onclick="return confirm('Are you sure you want to delete this item')" >Delete</a></td>
					<td><a href="${urlUpdate}/${listProduct.prodCode}">Edit</a></td>
					
				</tr>

			</c:forEach>

		</c:if>


	</table>

</body>
</html>