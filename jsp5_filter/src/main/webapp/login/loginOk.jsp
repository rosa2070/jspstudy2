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
	if(id.equals("test") && pwd.equals("1234")) { 
		session.setAttribute("id", id);
		response.sendRedirect(request.getContextPath() + "/main.jsp");
	} else {
		request.setAttribute("errMsg", "아이디 또는 비밀번호가 맞지 않아요.");
		RequestDispatcher rd = request.getRequestDispatcher(request.getContextPath() + "/login/login.jsp");
		rd.forward(request, response);
	}
%>

</body>
</html>