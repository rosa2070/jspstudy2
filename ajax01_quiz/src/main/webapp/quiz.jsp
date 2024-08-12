<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF  -8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function findId() {
		alert('a');
		const id = document.getElementById("email").value;
		const pwd = document.getElementById("pwd").value;
		const div = document.getElementById("result");
		const xhr = new XMLHttpRequest();
		xhr.onload = function() {
			const data = xhr.responseXML;
			const exist = data.getElementsByTagName("exist")[0].textContent;
			if (exist != null) {
				div.innerHTML = exist;
			} 
		}
		
	}
</script>
</head>
<body>
<!-- 이메일과 비밀번호를 입력받아 해당 아이디 찾기 구현해 보세요 (ajax) -->
<h1>아이디찾기</h1>
이메일 <input type="text" id="email"><br>
비밀번호 <input type="password" id="pwd"><br>
<input type="button" value="찾기" onclick="findId()">
<div id="result"></div> 
</body>
</html>