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

function ConfirmSave() {
	var x = confirm("Are you sure you want to Save?");
	if(x){
		return true;
	}else{
		return false;
	}
}

</script>
</head>
<body>
<a href="<c:url value="/orders-list" />" >List Order</a><br />
 <h1>Add new Orders:</h1>
 <c:url value="/saveOrders" var="saveOrders"/>
  <form:form  action="${saveOrders}" modelAttribute="orders"  method="POST" onsubmit="return ConfirmSave(this);" >
  		ProductCode 	 : <form:input path="productCode"  />
  		CustomerCode 	 : <form:input path="customerCode" />
  		Number 			 : <form:input path="number"/>	
  	    <button type="submit">Submit</button>
  
  </form:form>
</body>
</html>