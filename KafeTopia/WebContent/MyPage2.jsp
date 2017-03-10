<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<% String url = application.getContextPath() + "/"; %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>MyPage2.jsp</title>
<link href="http://fonts.googleapis.com/css?family=Oxygen:400,700,300" rel="stylesheet" type="text/css" />
<link href="css/bar.css" rel="stylesheet" type="text/css" media="screen" />

</head>
<body>

<div id="wrapper">

    <div class="utilMenuWrap">
    	<div class="utilMenu">
            <ul>
	<c:choose>
		<c:when test = "${empty sessionScope.userLoginInfo}">
			<li><a href="Login2.jsp">로그인</a></li>
			<li><a href="Join2.jsp">회원가입</a></li>
	     </c:when>
	     <c:otherwise>
	    	<li><a href="<%=url %>login/logout.do">로그아웃</a></li>
			<li><a href="MyPage.jsp">마이페이지</a></li>
		 </c:otherwise>
	 </c:choose>
            </ul>
		</div>
	</div>
	
<div id="logo" class="container">
		<h1><a href="#">Kafe Topia </a></h1>
</div>


<div id="menu-wrapper">
	<div id="menu" class="container">
		<ul>
			<li class="current_page_item"><a href="#">Cafe Order</a></li>
			<li><a href="#">Menu Order</a></li>
			<li><a href="#">Review Board</a></li>
		</ul>
	</div>
</div>













</div>


</body>
</html>