<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>글 내용 보기</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="500">
		<tr>
			<th width="100">번호</th>
			<td>${boardDto.bid }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDto.bhit }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardDto.bname }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${boardDto.btitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${boardDto.bcontent }</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${boardDto.bdate }</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수정" onclick="javascript:window.location.href=''">
				<input type="button" value="삭제" onclick="javascript:window.location.href=''">
				<input type="button" value="목록" onclick="javascript:window.location.href='list'">
			</td>
		</tr>
	</table>
</body>
</html>