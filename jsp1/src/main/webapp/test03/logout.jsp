<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test03/logout.jsp</title>
</head>
<body>
<%
	session.invalidate(); // 세션영역 무효화
	response.sendRedirect("main.jsp");
%>
<h1>회원님 로그아웃 되셨습니다..</h1>
<a href="main.jsp">main.jsp</a>
</body>
</html>