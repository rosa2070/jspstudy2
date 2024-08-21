<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	session.setAttribute("id", id);
	session.setAttribute("pwd", pwd);
%>
<h1>회원님 로그인 되셨습니다...</h1>
<a href="main.jsp">메인페이지로</a>
</body>
</html>