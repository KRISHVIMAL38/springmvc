<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>  
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help page</h1>
	
	<%
		/* String name=(String)request.getAttribute("name");
		Integer roll=(Integer)request.getAttribute("rollnumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("dte"); */
		
	%>
	<h1>Welcome ${name}</h1>
	<h2>Your roll number is ${rollnumber}</h2>
	<h2>Time now is ${dte}</h2>
	
	<c:forEach var ="item" items="${frnds }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>