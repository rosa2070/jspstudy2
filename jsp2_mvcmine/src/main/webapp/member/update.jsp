<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>ȸ������ ����</h1>
<form method="post" action="<%=request.getContextPath() %>/member/update">
	ȸ�����̵�<br>
	<input type="text" name="id" value="${m.id }" readonly="readonly"><br>
	��й�ȣ<br>
	<input type="password" name="pwd" value="${m.pwd }"><br>
	�̸���<br>
	<input type="text" name="email" value="${m.email }"><br>
	����<br>
	<input type="text" name="age" value="${m.age }"><br>
	<div>������ ${m.regdate }</div>
	<input type="submit" value="���">
</form>
</body>
</html>