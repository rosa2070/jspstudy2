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
		<th>이미지</th>		
	</tr>
	<c:forEach var="dto" items="${requestScope.list }">
		<tr>
			<td>${dto.filenum }</td>
			<td>${dto.title }</td>
			<td>${dto.orgfilename }</td>
			<td>${dto.savefilename }</td>
			<td>${dto.filesize }</td>
			<td><img src="<%=request.getContextPath() %>/upload/${dto.savefilename}"></td>
		</tr>
	</c:forEach>
</table>

<img src="<%=request.getContextPath()%>/img/snoopy.jpg">
<a href="<%=request.getContextPath()%>/main.jsp">메인페이지</a>
</body>
</html>