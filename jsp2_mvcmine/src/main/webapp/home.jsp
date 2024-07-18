<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
<ul>
	<li><a href="${pageContext.request.contextPath }/member/join">회원가입</a></li>
	
	<c:choose>
		<c:when test="${empty id }">
			<li><a href="${pageContext.request.contextPath }/member/login">로그인</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="${pageContext.request.contextPath }/member/logout">[${id }님 반가워요]로그아웃</a></li>
		</c:otherwise>
	</c:choose>
	<!-- 회원목록 출력기능 만들어보세요. -->
	<li><a href="<%=request.getContextPath() %>/member/list">회원목록</a></li>
</ul>
</body>
</html>