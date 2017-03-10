<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Join2.jsp</title>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
<link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:400,600'>
<link rel="stylesheet" href="css/join.css">


</head>
<body>

<div class="join-content">
	<h1 class="main-heading">Signup Now</h1>
	<h3 class="blurb">Creating an account is free ㅡ</h3>
	<form class="signup-form" method="post" action="#" novalidate="novalidate">
      <label for="signup-name">Full Name</label>
      <input id="signup-name" type="text" name="name" autocomplete="off"/>
      <label for="signup-email">Email Address</label>
      <input id="signup-email" type="email" name="email" autocomplete="off"/>
      <label for="signup-pw">Password</label>
      <input id="signup-pw" type="password" name="pw" autocomplete="off"/>
      <label for="signup-cpw">Confirm Password</label>
      <input id="signup-cpw" type="password" name="cpw" autocomplete="off"/>
      <button class="btn btn-outline submit-btn"><span>signup</span></button>
    </form>
</div>

</body>
</html>