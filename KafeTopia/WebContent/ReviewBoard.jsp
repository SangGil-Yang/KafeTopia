<%@page import="model.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ReviewBoard.jsp</title>
</head>
<body>
<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<tr>
        <td bgcolor="#336699">
            <p align="center">
            <font color="white"><b><span style="font-size:9pt;">글번호</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">글제목</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">작성자</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">작성일</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">조회수</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">추천수</span></b></font></p>
        </td>
    </tr>
    
    <c:if test="${empty requestScope.list}">
		<tr>
	        <td colspan="5">
	            <p align="center"><b><span style="font-size:9pt;">등록된 방명록이 없습니다.</span></b></p>
	        </td>
	    </tr>
	</c:if>
	<c:forEach items="${requestScope.list}" var="data">
		    <tr>
		        <td>
		            <p align="center"><span style="font-size:9pt;">${data.seq}</span></p>
		        </td>
		        <td>
					<p><span style="font-size:9pt;">${data.title}</span></p>
		        </td>
		        <td >
		            <p align="center"><span style="font-size:9pt;">${data.author}</span></p>
		        </td>
		        <td >
		            <p align="center"><span style="font-size:9pt;">${data.date}</span></p>
		        </td>
		        <td >
		            <p align="center"><span style="font-size:9pt;">${data.count}</span></p>
		        </td>
		        <td >
		            <p align="center"><span style="font-size:9pt;">${data.likecount}</span></p>
		        </td>
		    </tr>
	</c:forEach>
	
	
   </table>
    
    <hr>
	<div align=right>
	<span style="font-size:9pt;">&lt;<a href="WriteReview.jsp">글쓰기</a>&gt;</span></div>
	    
</body>
</html>