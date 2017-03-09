<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action = "login/memberInsert.do" method = "post">
		이름 <input type = "text" name="name">
		ID <input type = "text" name="id">
		비밀번호 <input type = "password" name="pw">
		이메일 주소 <input type = "text" name="email" size="40">
		전화번호 <input type = "text" name="tel">
		
		<br>
		<br>
		<input type = "submit" value = "회원가입">&nbsp;
		<input type = "reset" value = "취소">&nbsp;
	</form>

</body>
</html>