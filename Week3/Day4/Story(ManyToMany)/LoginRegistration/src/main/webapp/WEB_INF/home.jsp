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
<body class="container mt-4">
<a href="/logout" class="btn btn-danger">LogOut</a>

<a href="/stories/new" class="btn btn-labeled btn-success float-end"  style="width:15% ;border:1px solid #a64d79;background-color:#a64d79">
         <span class="btn-label"><i class="fa fa-plus"></i></span>Add new Story</a>



<h1> Hello   <c:out value="${ connectedUser.name  }"></c:out>  !!!! </h1>
<h2 style="color:#a64d79" class="mt-4">All Stories </h2>
<c:if test="${allStories.size()==0 }">
<div class="alert alert-primary" role="alert">
  There is no stories added yet! Hit the button above and start ^^
</div>
</c:if>	
<c:if test="${allStories.size()!=0 }">
<table class="table table-striped mt-4" style="width:70%">
  <thead>
    <tr>
      <th scope="col">Story</th>
     <th scope="col">Creator</th>
     <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${allStories}" var="story" >
    <tr>
      <th><a href="/stories/${story.id}">${story.title}</a> <br>
      
      </th>
      <th>
      
      <h4 style="color:#a64d79"><c:out value="${story.creator.getName() }"></c:out></h6>
      
      </th>
      <th>
      <c:if test="${story.creator.getId().equals(connectedUser.getId()) }">
      <a href="/edit/${story.id}">Edit</a>
      </c:if>
     <c:if test="${story.getLikers().contains(connectedUser) }">
      <a href="/dislike/${story.id}">Dislike</a>
      </c:if>
      <c:if test="${!story.getLikers().contains(connectedUser) }">
      <a href="/like/${story.id}">Like</a>
      </c:if>
      </th>
    </tr>
    </c:forEach>
  </tbody>
</table>


</c:if>



</body>
</html>