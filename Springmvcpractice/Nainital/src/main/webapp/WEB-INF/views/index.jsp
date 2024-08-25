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
	
	<%-- <c:forEach items="${name}" var="naam">
		<h1>${naam}</h1>
	</c:forEach> --%>
	
	<%
		List<String>list=(List<String>)request.getAttribute("name");
	
		for(String naam:list){
			%><h1><%=naam%></h1><% 
		}
	%>
	
</body>
</html>