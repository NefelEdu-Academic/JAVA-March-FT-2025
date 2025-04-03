<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>HELLO ${name} FROM FIRST JSP !!!</H1>

   <h1><c:out value="${name}"></c:out></h1> 
    <h1>${name}</h1>
</body>
</html>