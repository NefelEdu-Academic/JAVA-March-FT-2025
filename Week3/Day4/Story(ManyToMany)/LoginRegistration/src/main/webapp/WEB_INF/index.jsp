<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">


	<h2>Register</h2>

	<div class="container">
		<form:form action="/register" modelAttribute="newUser" class="form-control" method="post">
		
			<div class="form-row">
			 	
				<form:label for="userName" path="name">User Name:</form:label>
				<form:input type="text" path="name" class="form-control"/>
				<form:errors path="name" class="badge text-danger"/>
			</div>
			
			<div class="form-row">
				
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="email" path="email" class="form-control"/>
				<form:errors path="email" class="badge text-danger"/>
			</div>
			
			<div class="form-row">
				
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="pasword" path="password" class="form-control"/>
				<form:errors path="password" class="badge text-danger"/>
			</div>
			
			<div class="form-row">
				
				<form:label for="" path="confirm">Confirm:</form:label>
				<form:input type="confirm" path="confirm" class="form-control"/>
				<form:errors path="confirm" class="badge text-danger"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Register" class="btn btn-primary  mt-3"/>
			</div>
			
		</form:form>
	</div>
	<hr>
	<h2>Log In</h2>

	<div class="container">
		<form:form action="/login" modelAttribute="newLogin" class="form-control" method="post">
			<div class="form-row">
				<form:errors path="email" class="badge text-danger"/>
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="email" path="email" class="form-control"/>
			</div>
			
			<div>
				<form:errors path="password" class="badge text-danger"/>
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="pasword" path="password" class="form-control"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Login" class="btn btn-primary  mt-3"/>
			</div>
		
		</form:form>
	</div>

</div>
</body>
</html>