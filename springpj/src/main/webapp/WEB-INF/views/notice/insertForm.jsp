<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="<%=request.getContextPath()%>"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Jquery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<title>Insert title here</title>
<script>
	$(function(){
		$('#backBtn').click(function(){
			history.back();
		});
	});
</script>
</head>
<body>
	<h1>공지사항 작성하는 페이지</h1>
	<form action="${path}/notice/insert" method="post">
		<table border="1">
			<tr>
				<th>작성자</th><td><input type="hidden" name="writername" id="writername" value="${userName}"/>${userName}</td>
			</tr>
			<tr>
				<th>제목</th><td><input type="text" name="title" id="title" placeholder="제목을 입력해주세요"/></td>
			</tr>
			<tr>
				<th>내용</th><td><textarea rows="10" cols="30" name="content" id="content" placeholder="내용을 입력해주세요"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="작성하기"/>&nbsp;
					<input type="reset" value="취소"/>&nbsp;
					<input type="button" value="뒤로가기" id="backBtn"/> </td>
			</tr>
		</table>
	</form>
</body>
</html>