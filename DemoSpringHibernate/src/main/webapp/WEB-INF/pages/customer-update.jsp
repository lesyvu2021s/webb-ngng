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
function ConfirmSave()
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
<a href='<c:url value="/customer-list" ></c:url>' >List Customer</a>
<h1>Update Customer</h1>
<c:url value="/updateCustomer" var="updateCustomer" ></c:url>
<form:form action="${updateCustomer}" method="POST" modelAttribute="customer" onsubmit="return ConfirmSave()" >
	Code 	: <form:input path="custCode" readonly="true"  /> <br/>
	Name 	: <form:input path="name"/> <br/>
	Address : <form:input path="address"/> <br/>
	Phone 	: <form:input path="phone"/> <br/>
	<button type="Submit" >Save</button>
</form:form>

</body>
</html>