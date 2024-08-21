<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
<%
	String id = (String)request.getAttribute("id");
	String pwd = (String)request.getAttribute("pwd");
%>
id : <%= id %><br>
pwd : <%= pwd %><br>
</body>
</html>