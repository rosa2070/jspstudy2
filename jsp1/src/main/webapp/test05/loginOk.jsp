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
	if(id.equals("test") && pwd.equals("1234")) { //아이디와 비밀번호가 맞는 경우
		// session ?
		// 페이지이동 -> redirect
		session.setAttribute("id", id);
		response.sendRedirect("main.jsp");
	} else { // 아이디 또는 비밀번호가 틀렸을 경우 - 오류 메시지를 가지고 login.jsp페이지로 이동
		// request -> forward로 이동
		request.setAttribute("errMsg", "아이디 또는 비밀번호가 맞지 않아요.");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
%>

</body>
</html>