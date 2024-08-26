<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="500">
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
			<td><a href="<%=request.getContextPath()%>/board/delete?num=${vo.num}">삭제</a></td>
			<td><a href="<%=request.getContextPath()%>/board/update?num=${vo.num}">수정</a></td>
		</tr>
	</c:forEach>
</table>
<br>
<form method="post" action="<%=request.getContextPath()%>/board/list">
	<select name="field">
		<option value="title">글제목</option>
		<option value="writer">작성자</option>
		<option value="content">글내용</option>
	</select>
	<input type="text" name="keyword">
	<input type="submit" value="검색">
</form>
<br><br>
<a href="<%=request.getContextPath()%>/main.jsp">메인페이지</a>
</body>
</html>