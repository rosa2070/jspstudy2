<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>member/login.jsp</title>
</head>
<body>

<h1>ȸ���α���</h1>
<form action="<%=request.getContextPath() %>/member/login" method="post">
	���̵� <input type="text" name="id"><br>
	��й�ȣ <input type="password" name="pwd"><br>
	<div>${errMsg}</div>
	<input type="submit" value="�α���">
</form>   
</body>
</html>