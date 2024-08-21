<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인이 안 되어있으면 로그인이 보이고 
     로그인이 되어있으면 로그아웃이 보이도록 해보세요.
-->
<ul>
<%
	String id = (String) session.getAttribute("id");

	if (id == null || id.isEmpty()) {
		// 로그인이 안 되어 있을 때	
%>
	<li><a href="login.jsp">로그인</a></li>
<% } else { %>
	<!-- 로그인이 되어 있을 때 -->
	<li><a href="login.jsp"><%=id %>님 반갑습니다. [로그아웃]</a></li>
<% } %>
</ul>
<h1>우리우리 홈페이지...</h1>
</body>
</html>