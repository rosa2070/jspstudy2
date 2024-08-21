<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3/layout.jsp</title>
</head>
<body>
<div>
	<div>
		<jsp:include page="/3/header.jsp"></jsp:include>
	</div>
	<div>
		<jsp:include page="${content }"></jsp:include>
	</div>
	<div>
		<jsp:include page="/3/footer.jsp"></jsp:include>
	</div>
</div>
</body>
</html>