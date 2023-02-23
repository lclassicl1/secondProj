<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅방</title>
</head>
<!-- <script>
	function listMessage(){
		$.get(
				'./checkMessage',
			{
				roomNo:${param.roomNo}
			},
			'json'
		);
	}

setInterval(listMessage(),1000);
</script> -->
<body>
<h1>${param.roomNo }번방</h1>
	<%-- <form:form action="./addMessage" modelAttribute="chatDTO" method="post">
		<form:hidden path="roomNo" value="${param.roomNo }"/>
		<form:input path="writerId" />
		<form:input path="content"/>
		<input type="submit">
	</form:form> --%>
	
	 <form action="./addMessage" method="post">
			<input type="hidden" name="roomNo" value="${param.roomNo }"/>
			작성자 : <input type="text" name="writerId" placeholder="작성자"/><br>
			내용 : <input type="text" name="content" placeholder="내용"/><br>
			<input type="submit" value="작성">
	</form> 
	<div class="chat-message">
	
	</div>
</body>
</html>