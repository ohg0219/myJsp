<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//pageContext Scope 에 속성 저장하기
	pageContext.setAttribute("pageAttribute", "홍길동");
	
	//request Scope 에 속성 저장하기
	request.setAttribute("requestAttribute", "010-0000-0000");
	
	//session Scope 에 속성 저장하기
	session.setAttribute("sessionAttribute", "abc@abc.com");
	
	//application Scope에 속성 저장하기
	application.setAttribute("applicationAttribute", "Korea");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Example</title>
</head>
<body>

<ul>
	<li>이름 : <%=pageContext.getAttribute("pageAttribute") %>
	<li>전화번호 : <%=request.getAttribute("requestAttribute") %>
	<li>이메일 : <%=session.getAttribute("sessionAttribute") %>
	<li>국가 : <%=application.getAttribute("applicationAttribute") %>
</ul>


</body>
</html>