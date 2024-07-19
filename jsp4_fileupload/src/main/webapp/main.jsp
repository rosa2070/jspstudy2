<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<ul>
	<li><a href="<%=request.getContextPath()%>/insert.jsp">파일업로드</a>
	<!-- 파일목록(파일번호, 작성자, 전송된파일명, 저장된파일명, 파일크기) 출력해 보기 list.jsp -->
	<li><a href="<%=request.getContextPath()%>/file/list">파일목록</a>
</ul>
</body>
</html>