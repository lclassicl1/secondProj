<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>checkMessage</h3>
<h2>${roomNo }번방 채팅</h2>

	<c:forEach var="item" items="${list }">
		${item.writerId} : ${item.content}  [${item.creDate }]<br>
	</c:forEach>
</body>
</html>