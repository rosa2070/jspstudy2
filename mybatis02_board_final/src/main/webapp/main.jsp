<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<ul>
	<li><a href="<%=request.getContextPath()%>/board/insert">글등록</a></li>
	<li><a href="<%=request.getContextPath()%>/board/list">글목록1</a></li>
	<li><a href="<%=request.getContextPath()%>/board/list1">글목록2</a></li>
</ul>
</body>
</html>