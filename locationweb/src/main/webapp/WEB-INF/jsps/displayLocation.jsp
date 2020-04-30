<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
</head>
<body>
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Code</th>
      <th scope="col">Name</th>
      <th scope="col">Type</th>
    </tr>
  </thead>
  <c:forEach items="${location}" var="location">
  <tbody>
    <tr>
      <td>${location.id}</td>
      <td>${location.code}</td>
      <td>${location.name}</td>
      <td>${location.type}</td>
      <td><a href="deleteRecord?id=${location.id}">Delete</a></td>
      <td><a href="updateRecord?id=${location.id}">Edit</a>
    </tr>
  </tbody>
  </c:forEach>
</table>
</body>
</html>