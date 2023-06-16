<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록 보기</title>
</head>
<body>
	<h2>게시판 글목록</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="1000">
		<tr>
			<th>번호</th>			
			<th width="500">제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		
		<tr>
			<td>4</td>
			<td>안녕하세요!!</td>
			<td>tiger</td>
			<td>2023-06-16</td>
			<td>0</td>
		</tr>
		
		<tr>
			<td colspan="5">
			<input type="button" value="글쓰기" onclick="javascript:window.location='write_form'">
			</td>
		</tr>
	</table>
</body>
</html>