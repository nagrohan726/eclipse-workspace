<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.println("ID: " + id);
	out.println("Name: " + name);
	out.println("Salary: " + salary);
	%>

	<br /> 
	ID: <b>${id}</b> 
	Name: <b>${name}</b> 
	Salary: <b>${salary}</b>

</body>
</html>