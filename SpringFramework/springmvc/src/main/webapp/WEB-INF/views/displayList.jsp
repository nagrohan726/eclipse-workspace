<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.rohan.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Details</title>
</head>
<body>

	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	for (Employee employee : employees) {
		out.println(employee.getId());
		out.println(employee.getName());
		out.println(employee.getSalary());
	}
	%>

</body>
</html>