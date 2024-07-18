<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>home.jsp</title>
</head>
<body>
<ul>
<!--  글등록 기능을 완성해 보세요. -->
	<li><a href="${pageContext.request.contextPath }/board/insert">글등록</a></li>
	<li><a href="${pageContext.request.contextPath }/board/list">글목록</a></li>
</ul>
</body>
</html>