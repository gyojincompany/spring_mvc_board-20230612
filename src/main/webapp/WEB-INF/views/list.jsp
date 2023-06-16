<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
		<c:forEach items="${list}" var="boardDto">
		<tr>
			<td>${boardDto.bid }</td>
			<td>
			<a href="content_view?bid=${boardDto.bid }">${boardDto.btitle }</a>
			</td>
			<td>${boardDto.bname }</td>
			<td>${boardDto.bdate }</td>
			<td>${boardDto.bhit }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
			<input type="button" value="글쓰기" onclick="javascript:window.location='write_form'">
			</td>
		</tr>
	</table>
</body>
</html>