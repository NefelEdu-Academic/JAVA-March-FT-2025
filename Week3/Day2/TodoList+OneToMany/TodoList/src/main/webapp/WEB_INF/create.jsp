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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<div class="container">
        <h1 class="mt-4">Create To-Do</h1>
        <form:form modelAttribute="todo" method="POST" action="/todo/new">
            <div>
                
                <form:label path="title">Title: </form:label>
                <form:input type="text" path="title" class="form-control"/>
                <form:errors class="badge text-danger" path="title"/>
            </div>
             <div>
                
                <form:label path="description">Description: </form:label>
                <form:input type="text" path="description" class="form-control"/>
                <form:errors class="badge text-danger" path="description"/>
            </div>
            <!-- Select for the user attribute -->
            <form:label path="user">User:</form:label>
            <form:select path="user" class="form-control">
            <form:options  items="${users }" itemLabel="name"/>
            
            
            </form:select>
            
            <button type="submit" class="btn btn-primary">Save</button>
        </form:form>
    </div>
</body>
</body>
</html>