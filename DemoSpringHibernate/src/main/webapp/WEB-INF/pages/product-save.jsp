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
  var x = confirm("Are you sure you want to Save?");
  if (x)
      return true;
  else
    return false;
}
 
</script>
</head>
<body>
<a href="<c:url value="/product-list" />" >List Product</a><br />
<h1>Add new Product</h1>
 <c:url value="/saveProduct" var="saveProduct"/>
 <form:form action="${saveProduct}" method="POST" modelAttribute="product" onsubmit="return ConfirmSave(this); ">
  		 Name	: <form:input path="name" /> <br/> <br/>
     	 Price	: <form:input path="price" /> <br/> <br/>
      <button type="submit">Submit</button>
 </form:form>
</body>
</html>