<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>member/login.jsp</title>
</head>
<body>

<h1>회원로그인</h1>
<form action="<%=request.getContextPath() %>/member/login" method="post">
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="password" name="pwd"><br>
	<div>${errMsg}</div>
	<input type="submit" value="로그인">
</form>   
</body>
</html>