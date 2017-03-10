<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<% String url = application.getContextPath() + "/"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	 <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
     <link rel="stylesheet" href="css/main.css">
<title>KafeTopia</title>

</head>
<body>
<div>
    <div class="utilMenuWrap">
    	<div class="utilMenu">
            <ul>
	<c:choose>
		<c:when test = "${empty sessionScope.userLoginInfo}">
			<li><a href="Login.jsp">로그인</a></li>
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

<ul class="menu">
	<li><a href="CafeChoice.jsp"><span>Cafe Order</span></a></li>
	<li><a href="Order.jsp"><span>Menu Order</span></a></li>
	<li><a href="ReviewBoard.jsp"><span>Review Board</span></a></li>
</ul>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>

</div>
</body>
</html>