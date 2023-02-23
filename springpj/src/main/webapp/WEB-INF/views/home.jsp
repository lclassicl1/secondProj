<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>
	<a href="<%=request.getContextPath()%>/signIn">회원가입</a>
</h1>
<h1>
	<a href="<%=request.getContextPath()%>/chat/room?roomNo=1">1번 채팅방</a>
	<a href="<%=request.getContextPath()%>/chat/room?roomNo=2">2번 채팅방</a>
</h1>


<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
