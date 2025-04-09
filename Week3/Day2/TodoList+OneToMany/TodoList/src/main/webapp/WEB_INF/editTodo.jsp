<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    <title>Update To-Do</title>
</head>
<body>
<div class="container">
        <h1 class="mt-4">Update To-Do</h1>
        <form:form modelAttribute="todo" method="POST" action="/edit/todo/${todo.id}">
        <input type="hidden" name="_method" value="PUT">
            <div>
                
                <form:label path="title">Title: </form:label>
                <form:input type="text" path="title" class="form-control"/>
                <form:errors class="badge text-danger" path="title"/>
            </div>
            <div>
                
                <form:label path="description">Description: </form:label>
                <form:textarea path="description" class="form-control"></form:textarea>
                <form:errors  class="badge text-danger"  path="description"/>
            </div>
            <div>
                <form:errors path="completed"/>
                <form:label path="completed">Completed:</form:label>
                <form:checkbox path="completed" />
            </div>
              <!-- Select for the user attribute -->
            <form:label path="user">User:</form:label>
            <form:select path="user" class="form-control">
            <form:options  items="${users }" itemLabel="name"/>
            
            
            </form:select>
            <button type="submit" class="btn btn-primary mt-4">Edit</button>
        </form:form>
    </div>
</body>
</html>