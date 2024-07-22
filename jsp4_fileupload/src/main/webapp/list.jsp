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
<table border="1" width="500">
	<tr>
		<th>파일번호</th>
		<th>제목</th>
		<th>전송된 파일명</th>
		<th>저장된 파일명</th>
		<th>파일크기</th>
		<th>삭제</th>		
		<th>다운로드</th>
	</tr>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.filenum }</td>
			<td>${dto.title }</td>
			<td>${dto.orgfilename }</td>
			<td>${dto.savefilename }</td>
			<td>${dto.filesize }</td>
			<td><a href="<%=request.getContextPath()%>/file/delete?filenum=${dto.filenum}">삭제</a>
			<td><a href="<%=request.getContextPath() %>/file/download?filenum=${dto.filenum }">다운로드</a></td>
		</tr>
	</c:forEach>
</table>

<img src="<%=request.getContextPath()%>/img/pooh.jpg">
<a href="<%=request.getContextPath()%>/main.jsp">메인페이지</a>
</body>
</html>