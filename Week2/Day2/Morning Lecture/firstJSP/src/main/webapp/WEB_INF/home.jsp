<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="/css/style.css">
 <script type="text/javascript" src="/js/script.js"></script>  
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container">
<H1 id="testJs" onClick="testJs()" >HELLO FROM FIRST JSP !!!</H1>
<% out.println("hello");
int age = 28;
out.println(age);
%>
<% for(int i = 0; i < 5; i++) { %>
        <h1><%= i %></h1>
    <% } %>
    
    <h1> <%!  int myVar = 10; public int getMyVar() { return myVar; } %>   </h1>
    <h1> <%= getMyVar() %>   </h1>
   <h1><c:out value="${name}"></c:out></h1> 
    <h1>${name}</h1>
    <ul>
    <c:forEach var="oneMember" items="${ourList }">
    <li>
    <h1>${oneMember}</h1>
    </li>
    </c:forEach>
    </ul>
    <c:if test="${age>20 }">
    <h1 style="color:red">Hey you are  over 20 !! </h1>
    </c:if>
    <c:if test="${age<=20 }">
    <h1 style="color:green">Hey you are  less then 20 !! </h1>
    </c:if>
    <!-- If & else if -->
    <c:choose>
    <c:when test="${age>20 }"><h1 style="color:red">Hey you are  over 20 !! </h1></c:when>
    <c:otherwise><h1 style="color:green">Hey you are  less then 20 !! </h1></c:otherwise>
    
    </c:choose>
    <h1></h1>
    <div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</body>
</html>