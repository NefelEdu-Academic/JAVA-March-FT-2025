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


</head>
<body class="container">
   <form:form action="/story/new" method="POST" modelAttribute="story">
   <form:label path="title">Story Title:</form:label>
        <form:errors path="title" class="badge bg-danger" />
        <form:input  path="title" class="form-control"/>
      

  <form:label path="content">Add Your Description:</form:label>
        <form:errors path="content" class="badge bg-danger" />
       
        <form:textarea path="content" class="form-control" ></form:textarea>
   
  
  <button type="submit" class="btn btn-primary mt-4" style="border:1px solid #a64d79;background-color:#a64d79"">Create Story</button>
   </form:form>
</body>
</html>