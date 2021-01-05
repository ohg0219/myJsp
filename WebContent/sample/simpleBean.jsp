<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="msg" class="sample.SimpleData"/>
<jsp:setProperty property="message" name="msg"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>간단한 빈즈 프로그램 결과</h1>
<hr color="red"><br>
<font size="5">
	메세지 : <jsp:getProperty property="message" name="msg"/>
</font>
</body>
</html>