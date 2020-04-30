<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Update Location</title>
</head>
<body>
	<form class="row" action="saveUpdate" method="post">
		<div class="col-lg-6 ml-auto">
			<div class="form-group">
				<div class="col-md-4 mb-3">
					<label class="control-label col-sm-2">Id</label> 
					<input type="text" class="form-control" placeholder="ID" name="id" 
					      value="${location.id}" readonly />
				</div>
				<div class="col-md-4 mb-3">
					<label>Name</label> <input type="text" class="form-control"
						placeholder="Name" name="name" value="${location.name}"/>
				</div>
				<div class="col-md-4 mb-3">
					<label>Code</label> <input type="text" class="form-control"
						placeholder="code" name="code" value="${location.code}"/>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
					<input type="radio" name="type" value="Urban"${location.type=='Urban'?'checked':''}class="custom-control-input">
					<label class="custom-control-label">Urban</label>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
					<input type="radio" name="type" value="Rular"${location.type=='Rular'?'checked':''}class="custom-control-input">
					<label class="custom-control-label">Rural</label>
				</div>
				<button class="btn btn-primary" type="submit" name="save">Save</button>
			</div>
		</div>
	</form>
</body>
</html>