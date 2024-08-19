<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/5/movie.jsp</title>
<style>
	.comm{width:400px;height:100px; border:1px solid #aaa;margin: 5px;}
</style>
<script type="text/javascript">
	function commList() {
		let xhr = new XMLHttpRequest();
		xhr.onload = function() {
			let result = xhr.responseText;
			//alert(result);
			let data = JSON.parse(result);
			//기존의 댓글 목록 지우기
			const commList = document.getElementById("commList");
			const c_len = commList.childElementCount; // 댓글 수 구하기
			const childs = commList.childNodes;
			for (let i=c_len-1;i>=0;i--) {
				let c = childs.item(i);
				commList.removeChild(c);
			}
/* 			for (let i=0; i<data.list.length; i++) {
				let num = data.list[i].num;
				let id = data.list[i].id;
				let comments = data.list[i].comments;
				const html = "<div class='comm'>"
					+ "번호:" + num + "<br>"
					+ "작성자:" + id + "<br>"
					+ "내용:" + comments + "<br>"
					+ "<a href='javascript:delComm(" + num + ")'>삭제</a>" //삭제가능 완성해보세요.
				commList.innerHTML += html;
			} */
			
			data.list.forEach(comment => {
				const html = "<div class='comm'>"
					+ "번호:" + comment.num + "<br>"
					+ "작성자:" + comment.id + "<br>"
					+ "내용:" + comment.comments + "<br>"
					+ "<a href='javascript:delComm(" + comment.num + ")'>삭제</a>" //삭제가능 완성해보세요.
				commList.innerHTML += html;
			});
			
		};
		xhr.open('get', '/ajax02/comm/list?mnum=${vo.mnum}');
		xhr.send();
	}
	
	function addComm() {
		const xhr = new XMLHttpRequest();
		
		xhr.onload = function() {
			const data = JSON.parse(xhr.responseText);
			if (data.code==true) {
				commList();
			} else {
				alert("댓글등록 실패")
			}
		};
		
		xhr.open('post', '/ajax02/comm/insert', true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		const id = document.getElementById("id").value;
		const comments = document.getElementById("comments").value;
		const param = "id=" + id + "&comments=" + comments + "&mnum=${vo.mnum}";
		xhr.send(param);
			
	}
	
	function delComm(num) {
		const xhr = new XMLHttpRequest();
		
		xhr.onload = function() {
			const data = JSON.parse(xhr.responseText);
			if (data.code==true) {
				commList();
			} else {
				alert("댓글삭제 실패");
			}
		};
		
		xhr.open('get', '/ajax02/comm/delete?num=' + num, true);
		xhr.send();
		
	}
	

	
	window.onload = function() {
		commList();
	}
</script>
</head>
<body>
<div style="width:400px;height:200px;background-color:#ccc">
	<h1>${vo.title }</h1>
	<p>
		내용:${vo.content }<br>
		감독:${vo.director }<br>
	</p>
</div>
<div>
	<!-- 댓글목록이 보여질 div -->
	<div id="commList"></div>
	<div id="commAdd">
		아이디<br>
		<input type="text" id="id"><br>
		영화평<br>
		<textarea rows="3" cols="50" id="comments"></textarea><br>
		<!--  댓글등록 해보세요.(응답을 json으로) -->
		<input type="button" value="등록" onclick="addComm()">
	</div>
	<form enctype="application/x-www-form-urlencoded">
	
	</form>
</div>
</body>
</html>