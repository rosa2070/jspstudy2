<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글수정</h1>
<form method="post" action="<%=request.getContextPath() %>/board/update">
	글번호 <br>
	<input type="text" name="num" value="${vo.num }" readonly="readonly"><br>
	작성자 <br>
	<input type="Text" name="writer" value="${vo.writer }"><br>
	제목 <br>
	<input type="Text" name="title" value="${vo.title }"><br>
	내용 <br>
	<textarea rows="5" cols="50" name="content">${vo.content }</textarea><br>
	등록일 ${vo.regdate }<br>
	<input type="submit" value="등록">
</form>
</body>
</html>






