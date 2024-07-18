<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/list.jsp</title>
</head>
<body>
<table border="1" width="500">
	<tr>
		<th>아이디</th><th>비밀번호</th><th>이메일</th><th>나이</th><th>가입일</th>
		<th>수정</th><th>삭제</th>
	</tr>
	<c:forEach var="vo" items="${requestScope.list }">
		<tr>
			<td>${vo.id }</td>
			<td>${vo.pwd }</td>
			<td>${vo.email }</td>
			<td>${vo.age }</td>
			<td>${vo.regdate }</td>	
			<td><a href="<%=request.getContextPath()%>/member/update?id=${vo.id}">수정</a></td>
			<!-- 회원삭제 기능을 완성하세요. 회원삭제후 회원목록 페이지로 이동하도록 해보세요. -->
			<td><a href="<%=request.getContextPath()%>/member/delete?id=${vo.id}">삭제</a></td>
		</tr>
	</c:forEach>
</table>
<a href="<%=request.getContextPath()%>/home">메인페이지</a>

</body>
</html>



