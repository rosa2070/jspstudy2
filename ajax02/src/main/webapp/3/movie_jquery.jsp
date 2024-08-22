<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/5/movie.jsp</title>
<style>
	.comm {
		width: 400px;
		height: 100px;
		border: 1px solid #aaa;
		margin: 5px;
	}
</style>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript">

	// 댓글 목록을 가져오는 함수(전역 함수)
	function commList() {
		$.get('/ajax02/comm/list', { mnum: '${vo.mnum}' }, function(data) {
			const commList = $('#commList');
			commList.empty(); // 기존 댓글 목록 지우기
	
			data.list.forEach(comment => {
				const html = "<div class='comm'>"
					+ "번호:" + comment.num + "<br>"
					+ "작성자:" + comment.id + "<br>"
					+ "내용:" + comment.comments + "<br>"
					+ "<a href='javascript:delComm(" + comment.num + ")'>삭제</a>"
					+ "</div>";
				commList.append(html);
			});
		}, 'json');
	}
	
	//댓글을 삭제하는 함수(전역 함수)
	function delComm(num) {
		$.get('/ajax02/comm/delete', { num: num }, function(data) {
			if (data.code === true) {
				alert('삭제 성공!');
				commList(); // 댓글 목록 갱신
			} else {
				alert('삭제 실패');
			}
		}, 'json');
	}
	
	// 댓글을 추가하는 함수
	function addComm() {
		const id = $('#id').val();
		const comments = $('#comments').val();
		const param = { id: id, comments: comments, mnum: '${vo.mnum}' };

		$.post('/ajax02/comm/insert', param, function(data) {
			if (data.code === true) {
				commList(); // 댓글 목록 갱신
			} else {
				alert('댓글 등록 실패');
			}
		}, 'json');
	}
	
	$(document).ready(function() {
		// 페이지 로드 시 댓글 목록을 가져옵니다.
		commList();

		// 등록 버튼 클릭 시 댓글을 추가합니다.
		$('#commAdd input[type="button"]').click(function() {
			addComm();
		});
	});
</script>
</head>
<body>
	<div style="width: 400px; height: 200px; background-color: #ccc">
		<h1>${vo.title }</h1>
		<p>
			내용:${vo.content }<br> 감독:${vo.director }<br>
		</p>
	</div>
	<div>
		<!-- 댓글목록이 보여질 div -->
		<div id="commList"></div>
		<div id="commAdd">
			아이디<br> <input type="text" id="id"><br> 영화평<br>
			<textarea rows="3" cols="50" id="comments"></textarea>
			<br>
			<!-- 댓글 등록 버튼 -->
			<input type="button" value="등록">
		</div>
		<form enctype="application/x-www-form-urlencoded"></form>
	</div>
</body>
</html>