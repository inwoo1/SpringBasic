<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--다음 화면을 처리하는 메서드를 컨트롤러에 생성하세요 --%>
	<h2>게시글 목록</h2>
	
	<table>
	<c:forEach var="bo" items="${list }" varStatus="num" >
		<tr>
			<td>번호:${num.index }</td>
			<td>작성자:${bo.name }</td>
			<td>제목:${bo.title }</td>
			<td>내용:${bo.content }</td>
			<td>비고:${num.index }</td>
		<td><input type="button" value="삭제" onclick="location.href='boardDelete?num=${num.index}'"></td>
		</tr>
	</c:forEach>
	</table>
		
	<%--게시글 작성페이지로 이동시키세요. --%>
	<a href="boardRegister">게시글 작성</a>
		
			<!-- 
			1. boardDelete로 삭제 처리하세요. 
			2. 삭제 후엔 목록화면으로 리다이렉트 하세요.
			-->
			
	<script>
		var msg = '${msg}';  //문자열 표기  값이없을때 공백
		
		if(msg != ""){
			alert(msg);
		}
	
	</script>

	
	
</body>
</html>