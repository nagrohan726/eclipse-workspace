<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cout Demo</title>
</head>
<body>
	<c:out value="${10+9}"></c:out>
	<c:set var="testScore" value="${90}" scope="session" />
	<c:out value="${testScore}" />
	<c:if test="${testScore>=80}">
		<p>
			Your score is Awesome:
			<c:out value="${testScore}" />
		</p>
	</c:if>

	<c:choose>
		<c:when test="${testScore>=80}">
			A Grade
		</c:when>
		<c:when test="${testScore>=60 && testScore<80}">
			B Grade
		</c:when>
		<c:otherwise>
			C Grade
		</c:otherwise>
	</c:choose>

	<c:forEach var="i" begin="1" end="3">
		<c:out value="${i}" />
	</c:forEach>

	<%
	List<String> studentNames = new ArrayList<>();
	studentNames.add("John");
	studentNames.add("Bob");
	studentNames.add("Rohan");
	request.setAttribute("studentNames", studentNames);
	%>
	<c:forEach var="studentName" items="${studentNames}">
		<c:out value="${studentName}" />
	</c:forEach>

	<c:remove var="testScore" />
	After Removal the value is:
	<c:out value="${testScore}" />

	<c:set var="accountBalance" value="123.456" />

	<fmt:parseNumber var="i" type="number" value="${accountBalance}" />
	<p>
		Balance is:
		<c:out value="${i}" />
	</p>

	<c:set var="accountBalance" value="123.456" />
	<p>
		Formatted Number 1:
		<fmt:formatNumber value="${accountBalance}" type="currency" />
	</p>
	<p>
		Formatted Number 2:
		<fmt:formatNumber value="${accountBalance}" type="number"
			maxFractionDigits="2" />
	</p>
	<p>
		Formatted Number 3:
		<fmt:formatNumber value="${accountBalance}" type="number"
			maxIntegerDigits="2" />
	</p>
	<p>
		Formatted Number 4:
		<fmt:formatNumber value="${accountBalance}" type="percent" />
	</p>
	<p>
		Formatted Number 5:
		<fmt:formatNumber value="${accountBalance}" type="number"
			pattern="$ ####.##" />
	</p>

	<c:set var="myDate" value="12-07-2022" />
	<fmt:parseDate var="parsedDate" value="${myDate}" pattern="dd-MM-yyyy" />
	<p>
		Parsed Date:
		<c:out value="${parsedDate}" />
	</p>
</body>
</html>