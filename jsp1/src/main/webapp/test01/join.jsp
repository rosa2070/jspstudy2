<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
%>
<h1>회원가입에 성공하셨습니다...</h1>
가입된 정보<br>
id : <%= id %><br>
pwd : <%= pwd %><br>
email : <%= email %><br>
선택된 취미 <br>
<%
	String[] hobbies = request.getParameterValues("hobby");
	if (hobbies != null) {
		for (String hobby : hobbies) {
			out.print(hobby + " ");
		}
	}
	// 사는 지역 출력
	String addr = request.getParameter("addr");
%>
<br>
사는 지역 : <%= addr %>
<br>
</body>
</html>