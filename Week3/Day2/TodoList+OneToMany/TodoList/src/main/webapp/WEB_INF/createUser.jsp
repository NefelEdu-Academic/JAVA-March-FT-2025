<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1 class="mt-4">Create User</h1>
        <form:form modelAttribute="user" method="POST" action="/user/new">
            <div>
                
                <form:label path="name">Name: </form:label>
                <form:input type="text" path="name" class="form-control"/>
                <form:errors class="badge text-danger" path="name"/>
            </div>
             
            
            <button type="submit" class="btn btn-primary">Save</button>
        </form:form>
</body>
</html>