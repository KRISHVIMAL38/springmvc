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
	<h1>Your Credentials Are</h1>
	<h1>Email  ${user.useremail}</h1>
	<h1>UserName ${user.username}</h1>
	<h1>UserPassword ${user.userpwd}</h1>
</body>
</html>