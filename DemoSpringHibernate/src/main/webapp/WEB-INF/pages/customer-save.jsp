<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
</head>
<body>
<a href="<c:url value="/customer-list" />" >List Customer</a> <br /><br/>

<h1>Add new Customer</h1>
<c:url value="/saveCustomer" var="saveCustomer" ></c:url>
<form:form action="${saveCustomer}" method="POST" modelAttribute="customer" >
	Name 	:<form:input path="name"/> <br /> <br /> 
	Address : <form:input path="address"/> <br /> <br /> 
	Phone 	: <form:input path="phone"/> <br /> <br /> 
	
	<button type="submit">Submit</button>
</form:form>
</body>
</html>