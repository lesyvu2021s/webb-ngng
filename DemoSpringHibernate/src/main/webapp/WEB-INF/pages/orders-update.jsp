<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function ConfirmUpdate()
{
  var x = confirm("Are you sure you want to Update?");
  if (x)
      return true;
  else
    return false;
} 
</script>
</head>
<body>
<a href='<c:url value ="/orders-list" ></c:url>' > List Orders</a>
<h1>Edit Order : </h1>

<c:url value="/updateOrders" var="updateOrders" ></c:url>
	<form:form action="${updateOrders}" method="POST" modelAttribute="orders" onsubmit="return ConfirmUpdate(this)"  >
	OrdersCode  : <form:input path="orderCode" readonly="true"/> <br/>
	ProductCode : <form:input path="productCode"/><br/>
	CustomerCode: <form:input path="customerCode"/><br/>
	Number		:	<form:input path="number"/><br/>
	
	<button type="submit">Submit</button>
	</form:form>
</body>
</html>