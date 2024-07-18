<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/join.jsp</title>
</head>
<body>
<h1>회원가입</h1>
<form method="post" action="<%=request.getContextPath() %>/member/join">
	회원아이디<br>
	<input type="text" name="id" ><br>
	비밀번호<br>
	<input type="password" name="pwd" ><br>
	이메일<br>
	<input type="text" name="email" ><br>
	나이<br>
	<input type="text" name="age" ><br>
	<input type="submit" value="등록">
</form>
</body>
</html>




