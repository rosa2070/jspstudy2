<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- header.jsp -->
<div style="color:white;">
	<ul>
		<li><a href="${pageContext.request.contextPath }/home">홈</a></li>		
		<c:choose>
			<c:when test="${empty sessionScope.id }">
				<li><a href="${pageContext.request.contextPath }/login">로그인</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="${pageContext.request.contextPath }/logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>		
		<li><a href="${pageContext.request.contextPath }/company">회사소개</a></li>
		<li><a href="${pageContext.request.contextPath }/board">게시판</a></li>
	</ul>
</div>