<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My name is : ${name eq "nick rocksvold" }</h1>
<h2>I am also ${student.name}</h2>

<c:out value="${fn:toLowerCase('B2TECH')}"></c:out>

<c:out value="The jstl value"></c:out>

<c:set var = "i" value = "${10*20}"></c:set>

<p>Before: <c:out value = "${i}"></c:out></p>
<c:remove var="i"/>
<p>After: <c:out value = "${i}"></c:out></p>

<a href="<c:url value="/index.html"></c:url>">Click Here!</a>

<c:set var = "score" value="75"></c:set>

<c:choose>
	<c:when test="${score > 100}">
		<p>Score is greater than 100</p>
	</c:when>
	
	<c:otherwise>
		<p>Score is less than 100</p>
	</c:otherwise>
	
</c:choose>

<c:if test="${2000 < 1000}">
<p>True Block Son!!!</p>
</c:if>

<table>
<thead>
	<tr>
	<td>Name</td>
	<td>Age</td>
	<td>Location</td>
	</tr>
</thead>
<tbody>
<c:forEach items = "${list}" var="student">
    <tr>
	<td>${student.name}</td>
	<td>${student.age}</td>
	<td>${student.location}</td>
	</tr>
	</c:forEach>
	</tbody>
</table>




</body>
</html>