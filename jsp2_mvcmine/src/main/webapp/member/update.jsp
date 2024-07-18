<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 수정</h1>
<form method="post" action="<%=request.getContextPath() %>/member/update">
	회원아이디<br>
	<input type="text" name="id" value="${m.id }" readonly="readonly"><br>
	비밀번호<br>
	<input type="password" name="pwd" value="${m.pwd }"><br>
	이메일<br>
	<input type="text" name="email" value="${m.email }"><br>
	나이<br>
	<input type="text" name="age" value="${m.age }"><br>
	<div>가입일 ${m.regdate }</div>
	<input type="submit" value="등록">
</form>
</body>
</html>