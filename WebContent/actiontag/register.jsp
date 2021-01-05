<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	<form action="add.jsp" method="post">
		<label>이름 : <input type="text" name="name" size="25"></label><br>
		<label>이메일 : <input type="text" name="email" size="25"></label><br>
		<label>전화 : <input type="text" name="phone" size="25"></label><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>