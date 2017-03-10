<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% String url = application.getContextPath() + "/"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>������ ���� ǥ���ϱ�</title>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=CenGbaf3TdyDp5c4AJha"></script>
</head>
<body>
<div id="map" style="width:100%;height:400px;"></div>

<script>
var mapOptions = {
    center: new naver.maps.LatLng(37.3595704, 127.105399),
    zoom: 10
};

var map = new naver.maps.Map('map', mapOptions);
</script>
	<c:forEach items="${menuType }" var="type">
		<a href="<%=url %>order/menuAll.do?type=${type }">${type }<br></a> 
	</c:forEach>
	
	<c:forEach items="${cafeMenu }" var="menu">
		${menu }<br>
	</c:forEach>
	
	
	<c:forEach items="${topping }" var="topping">
		${topping }
	</c:forEach>
</body>
</html>