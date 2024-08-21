<%@page import="java.io.PrintWriter"%>
<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%
//meminfo.jsp
	String id = "hello";
	String name = "김헬로";
	int age=10;
	
	JSONObject json = new JSONObject();
	json.put("id", id);
	json.put("name", name);
	json.put("age", age);
	
	response.setContentType("application/json;charset=utf-8");
	PrintWriter pw = response.getWriter();
	pw.print(json.toString());
	pw.close();
%>