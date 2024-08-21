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
<ul>
	<c:choose>
		<c:when test="${empty id }">
			<li><a href="${cp}/login/login.jsp">로그인</a>
		</c:when>
		<c:otherwise>
			<li><a href="${cp}/login/logout.jsp">로그아웃</a></li>
		</c:otherwise>
	</c:choose>
	<li><a href="${cp}/member/insert.jsp">글등록</a>
	<li><a href="${cp}/member/list">회원목록</a>
</ul>
</body>
</html>