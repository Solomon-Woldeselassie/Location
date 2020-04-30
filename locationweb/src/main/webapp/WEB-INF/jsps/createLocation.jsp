<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="row" action="saveloc" method="post">
		<div class="col-lg-6 ml-auto">
			<div class="form-group">
				<div class="col-md-4 mb-3">
					<label class="control-label col-sm-2">Id</label> <input type="text"
						class="form-control" placeholder="ID" name="id" />
				</div>
				<div class="col-md-4 mb-3">
					<label>Name</label> <input type="text" class="form-control"
						placeholder="Name" name="name" />
				</div>
				<div class="col-md-4 mb-3">
					<label>Code</label> <input type="text" class="form-control"
						placeholder="code" name="code" />
				</div>
				<div class="custom-control custom-radio custom-control-inline">
					<input type="radio" name="type" value="Urban" class="custom-control-input">
					<label class="custom-control-label"> Urban</label>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
					<input type="radio" name="type" value="Rular" class="custom-control-input">
					<label class="custom-control-label">Rural</label>
				</div>
				<button class="btn btn-primary" type="submit" name="save">Save</button>
			</div>
		</div>
	</form>
	${msg}
	<div>
	<a href="viewAll" class="text-decoration-none">View Data</a>
	</div>
</body>
</html>