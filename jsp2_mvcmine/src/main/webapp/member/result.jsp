<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/result.jsp</title>
</head>
<body>
<h1>요청하신 작업이 처리되었습니다...</h1>
<p>${msg }</p>
<a href="<%=request.getContextPath() %>/home.jsp">home.jsp</a>
</body>
</html>