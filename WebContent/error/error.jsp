<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외</title>
</head>
<body>
요청 처리과정에서 예외가 발생하였다.
빠른시간내에 문제해결할께
<br><br>
에러 타입 : <%=exception.getClass().getName() %>
에러 내용 : <%=exception.getMessage() %>
</body>
</html>