<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>ex02 - 파라미터의값 처리</h3>
	
	<form action="param" method="post">
		아이디:<input type="text" name="id"><br>
		나이:<input type="text" name="age"><br>
		
		분야:
		<input type="checkbox" name="inter" value="1">자바
		<input type="checkbox" name="inter" value="2">스프링
		<input type="checkbox" name="inter" value="3">JS
		
		<input type="submit" value="파라미터값 받기">
		
	</form>
	

</body>
</html>