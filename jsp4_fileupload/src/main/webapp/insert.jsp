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
<!-- 
	< 파일업로드시 form에 아래 속성을 꼭 설정해야 함 >
	method="post"
	enctype="multipart/form-data"
 -->
 <form method="post" action="<%=request.getContextPath() %>/file/upload" enctype="multipart/form-data">
 	작성자<br>
 	<input type="text" name="writer"><br>
 	제목<br>
 	<input type="text" name="title"><br>
 	내용<br>
 	<textarea name="content" rows="5" cols="50"></textarea><br>
 	첨부파일
 	<input type="file" name="file1"><br>
 	<input type="submit" value="전송">
 </form>
</body>
</html>