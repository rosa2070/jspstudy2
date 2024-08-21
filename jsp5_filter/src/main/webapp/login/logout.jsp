<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// login/logout.jsp
	session.invalidate();
	response.sendRedirect("${cp}/");
%>