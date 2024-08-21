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
	
	request.setAttribute("id", id);
	request.setAttribute("pwd", pwd);
	
	//리다이렉트 방식으로 이동 - request, response는 유지되지 않는다. (null나옴)
	//response.sendRedirect("result.jsp");
	//포워드 방식으로 이동 - request, response는 유지된다.
	RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	rd.forward(request, response);
%>

</body>
</html>