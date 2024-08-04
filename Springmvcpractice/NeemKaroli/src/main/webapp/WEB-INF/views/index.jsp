<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Jai shree ram</h1>
	<h2>Jai hanumaan</h2>
	
	<h1>My name is ${name }</h1>
	<h1>my roll number is ${rollno}</h1>
	
	<c:forEach var ="item" items="${count}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>