<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
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
<a href='<c:url value="/product-list" ></c:url>' >List Product</a>
<h1>Edit Product</h1>
<c:url value="/updateProduct" var="updateProduct" ></c:url>
<form:form action="${updateProduct}"   method="POST" modelAttribute="product" onsubmit="return ConfirmUpdate();  " >
   Code 	: <form:input path="prodCode" readonly="true"  /> <br/> <br/>
   Name 	: <form:input path="name"   /> <br/> <br/>
   Price 	: <form:input path="price"   /> <br/> <br/>
   
   <button type="submit" >Save</button>
</form:form>
</body>
</html>