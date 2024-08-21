<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  에러메시지를 div에 출력해 보세요. 
	잘못 입력된 아이디와 비밀번호가 보여지도록 해보세요.
-->
<%
	String errMsg = (String)request.getAttribute("errMsg");
	//String id = request.getParameter("id");
	//String pwd = request.getParameter("pwd");
	if(errMsg==null) errMsg = "";
	

%>
<h1>회원로그인</h1>
<form action="loginOk.jsp" method="post">
	아이디 <input type="text" name="id" value="${param.id }"><br>
	비밀번호 <input type="password" name="pwd" value="${param.pwd}"><br>
	<div><%= errMsg %></div>
	<input type="submit" value="로그인">
</form>
</body>
</html>