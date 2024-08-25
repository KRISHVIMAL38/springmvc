<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is success page</title>
</head>
<body>
	<h1>You made it bro</h1>
	<h1>${user.username}</h1>
	<h1>${user.useremail}</h1>
	<h1>${user.password}</h1>
	
</body>
</html>