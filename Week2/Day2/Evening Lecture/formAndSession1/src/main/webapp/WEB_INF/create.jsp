<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="/css/style.css">
 
<meta charset="UTF-8">
<title>Create Player</title>
</head>
<body class="container">
<form action="/create" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">First Name</label>
    <h1 class="text-danger"> <c:out value="${ message}"></c:out> </h1>
    <input type="text" class="form-control" name="firstName"  >
  
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Last Name</label>
    <input type="text" name="lastName"  class="form-control" >
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<h1> <c:out value="${ firstName}"></c:out> </h1>
<h1> <c:out value="${ test}"></c:out> </h1>

</body>
</html>