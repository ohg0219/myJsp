<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
	<h2>JSP Script 예제</h2>
	<% //Script - 연산,처리 
		String script = "스트립트릿 입니다.";
		String comment = "주석문 입니다.";
		out.print("내장객체를 이용한 출력 : "+declation+"<br>");
	%>
	선언문 출력하기(변수) : <%= declation %><br></br>
	선언문 출력하기(메소드) : <%=declationMethod() %><br></br>
	스트립트릿 출력하기 : <%=script %><br></br>
	<!-- jsp 에서 사용하는 html 주석부분 --><br>
	<!-- html 주석 : <%=comment%> --><br>
	<%--jsp 주석 : <%=comment%> --%><br>
	<%
		//자바주석
		/*
			여러줄 주석
		*/
	%>
	<%!
		//declation = 변수선언
		String declation = "선언문입니다.";
	%>
	<%!
		public String declationMethod(){
			return declation;
		}
	%>
</body>
</html>