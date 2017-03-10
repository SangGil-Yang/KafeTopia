<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<% String url = application.getContextPath() + "/"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>KafeTopia</title>
</head>
<body>
<c:choose>
	<c:when test = "${empty sessionScope.userLoginInfo}">
		<a href = "Login.jsp">로그인</a>
		<a href = "Join.jsp">회원가입</a>
		<br><br>
	</c:when>
	
	<c:otherwise>
		<a href = "MyPage.jsp">마이페이지</a>
		<a href = "<%=url %>login/logout.do">로그아웃</a>
	</c:otherwise>
</c:choose>
	<input type = "button" value = "카페별 주문" Onclick = "location.href='<%=url %>order/cafeAll.do'">
	<input type = "button" value = "메뉴별 주문" Onclick = "location.href='Order.jsp'">
	<input type = "button" value = "게시판" Onclick = "location.href='ViewReview.jsp'">
</body>
</html>