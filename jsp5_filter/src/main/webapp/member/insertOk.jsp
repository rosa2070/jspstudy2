<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 전송된 데이터 출력해 보세요 -->
<%
//	request.setCharacterEncoding("utf-8");
	String writer = request.getParameter("writer");
%>
작성자 <%=writer %> <br>
내용 ${param.title } <br>
내용 ${param.content } <br>
<a href="${cp }/">홈</a>
</body>
</html>