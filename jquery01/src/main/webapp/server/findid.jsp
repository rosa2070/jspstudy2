<%@page import="org.json.JSONObject"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="db.JdbcUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%

	//findid.jsp
	String email = request.getParameter("email");
	String password = request.getParameter("pwd");
	
	//찾은 id
	String userid = "";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		con = JdbcUtil.getCon();
		String sql = "select userid from member where email = ? and pwd=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			userid = rs.getString("userid");
		}
	} catch (SQLException s) {
		s.printStackTrace();
	} finally {
		try {
			if (rs!=null) rs.close();
			if (pstmt!=null) pstmt.close();
			if (con!=null) con.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	
	response.setContentType("application/json;charset=utf-8");
	PrintWriter pw = response.getWriter();
	JSONObject json = new JSONObject();
	json.put("userid", userid.isEmpty()? null: userid); // 아이디가 없으면 null로 설정 
	pw.print(json);
	pw.close();
	
%>