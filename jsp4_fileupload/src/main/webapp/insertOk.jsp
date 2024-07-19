<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/*
MultiparRequest(
		javax.servlet.http.HttpServletRequest request,
		java.lang.String saveDirectory,
		int maxPostSize,
		java.lang.String encoding,
		FileRenamePolicy policy)
*/
	String uploadPath = application.getRealPath("/upload"); //upload 폴더의 실제 경로 얻어오기
	out.print(uploadPath + "<br>");
	
	MultipartRequest mr = new MultipartRequest(
			request,
			uploadPath, // 저장할 디렉토리
			1024 * 1024 * 5, // 업로드할 최대 크기
			"utf-8",
			new DefaultFileRenamePolicy()
	);

%>
<h1>파일 업로드 완료!!!!</h1>

</body>
</html>