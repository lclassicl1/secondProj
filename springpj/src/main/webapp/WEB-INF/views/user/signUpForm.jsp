<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
 
    request.setCharacterEncoding("UTF-8");
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h3>회원가입</h3>
	<hr/>
	<form:form action="/signUp" modelAttribute="user" method="post" accept-charset="utf-8">
	아이디:<form:input path="id" name="id"/><br/>
	비밀번호:<form:password path="password"/><br/>
	이름:<form:input path="name"/><br/>
	우편번호:<form:input path="zipcode"/><br/>
	주소:<form:input path="address"/><br/>
	상세주소:<form:input path="detailaddress"/><br/>
	주민등록번호:<form:input path="pricynum"/><br/>
	이메일:<form:input path="email"/><br/>
	전화번호:<form:input path="phonenum"/><br/>
	성별:<form:radiobutton path="gender" value="M"/> 남성
		<form:radiobutton path="gender" value="F"/> 여성<br/>
	
	<input type="submit" value="가입하기">
	<input type="reset" value="다시쓰기">
	</form:form>
</body>
</html>