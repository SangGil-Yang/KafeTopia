<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>WriteReview.jsp</title>
<SCRIPT language=javascript>
function checkValid() {
    var f = window.document.writeForm;
		
	if ( f.author.value == "") {
	    alert( "작성자를 입력해 주세요." );
		return false;
    }
	if ( f.cafeid.value == "" ) {
		alert( "카페이름을 입력해 주세요." );
		return false;
	}
	if ( f.title.value == "" ) {
		alert( "제목을 입력해 주세요." );
		return false;
	}
	if ( f.content.value == "" ) {
        alert( "내용을 입력해 주세요" );
        return false;
    }
    return true;
}
</SCRIPT>
</head>
<body>
<form name="writeForm" method="post" action="board/write.do" onSubmit='return checkValid()'>
<input type="hidden" name="command" value="write">
<table align="center" cellpadding="5" cellspacing="2" width="600" border="1">

   <tr>
        <td width="1220" height="20" colspan="2" bgcolor="#336699">
            <p align="center"><font color="white" size="3"><b>리뷰 작성</b></font></p>
        </td>
    </tr>
    <tr>
        <td width="150" height="20" >
            <p align="right"><b><span style="font-size:9pt;">작성자</span></b></p>
        </td>
        <td width="450" height="20"><b><span style="font-size:9pt;">
		<input type=text name="author" size="30"></span></b></td>
    </tr>
    <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">제목</span></b></p>
        </td>
        <td width="450" height="20" ><b><span style="font-size:9pt;">
		<input type=text name="title" size="50"></span></b></td>
    </tr>
     <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">카페 이름</span></b></p>
        </td>
        <td width="450" height="20" ><b><span style="font-size:9pt;">
		<input type=text name="title" size="50"></span></b></td>
    </tr>
	 <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">내용</span></b></p>
        </td>
        <td width="450" height="20"><b><span style="font-size:9pt;">
		<textarea name="content" cols="50" rows="10"></textarea></span></b></td>
    </tr>
    <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">&nbsp;</span></b></p>
        </td>
        <td width="450" height="20"><b><span style="font-size:9pt;"><input type=submit value=글쓰기> 
        <input type=reset value=다시쓰기></span></b></td>
    </tr>

</table>


</form>

<hr>
<div align=right><span style="font-size:9pt;">&lt;<a href="board/list.do">리스트로 돌아가기</a>&gt;</span></div>

</body>
</html>