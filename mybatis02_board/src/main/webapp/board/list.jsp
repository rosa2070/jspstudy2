<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<table border="1">
	<tr>
		<th>번호</th><th>작성자</th><th>제목</th><th>내용</th><th>작성일</th>
		<th>삭제</th><th>수정</th>
	</tr>
	<c:forEach var="vo" items="${requestScope.list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td>${vo.title }</td>
			<td>${vo.content }</td>
			<td>${vo.regdate }</td>
			<td><a href="<%=request.getContextPath()%>/delete?num=${vo.num}">삭제</a></td>
			<td><a href="<%=request.getContextPath()%>/update?num=${vo.num}">수정</a></td>
		</tr>
	</c:forEach>
</table>

<a href="<%=request.getContextPath() %>/main.jsp">메인페이지</a>
</body>
</html>