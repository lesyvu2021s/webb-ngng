<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Page</title>
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
  <c:url value="/customer-save" var="urlSave"/>
  <c:url value="/customer-view/" var="urlView"/>
  <c:url value="/customer-update/" var="urlUpdate"/>
  <c:url value="/deleteCustomer/" var="urlDelete"/>
  
   <a href="<c:url value="/product-list" />" >List Product</a><br /> <br/>
  
  <h1>List Customer</h1>
  
 
  
  <form action='<c:url value="/customer/search" ></c:url>'>
  	<input type="text" placeholder="Enter text to Search "  name="txt" >
  	<button >Find</button>
  </form>
  
  
  <a href="${urlSave}" >Add Customer</a>
  
  <table>
   <tr>
      <th>Code</th>
      <th>Name</th>
      <th>Address</th>
      <th>Phone</th>
      <th>View</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    <c:if test="${not empty listCustomer }">
    <c:forEach var="customer" items="${listCustomer}" >
    <tr style="border: 1px black solid ">
    <td>${customer.custCode}</td>
    <td>${customer.name}</td>
    <td>${customer.address}</td>
    <td>${customer.phone}</td>
    <td><a href="${urlView}/${customer.custCode}">View</a>
    <td><a href="${urlUpdate}/${customer.custCode}">Edit</a>
    <td><a href="${urlDelete}/${customer.custCode}" title="delete" onclick="return confirm('Are you sure you want to delete this item')">Delete</a>
    </tr>
    
    </c:forEach>
    
    </c:if>
  
  </table>
</body>
</html>