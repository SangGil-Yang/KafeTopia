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
		�̸� <input type = "text" name="name">
		ID <input type = "text" name="id">
		��й�ȣ <input type = "password" name="pw">
		�̸��� �ּ� <input type = "text" name="email" size="40">
		��ȭ��ȣ <input type = "text" name="tel">
		
		<br>
		<br>
		<input type = "submit" value = "ȸ������">&nbsp;
		<input type = "reset" value = "���">&nbsp;
	</form>

</body>
</html>