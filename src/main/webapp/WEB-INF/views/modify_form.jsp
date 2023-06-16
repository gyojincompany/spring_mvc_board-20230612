<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글수정</title>
</head>
<body>
	<h2>게시판 글수정</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<form action="modify">
		
		<input type="hidden" name="bid" size="60" value="${boardDto.bid }">
		
		<tr>
			<td>이 름</td>
			<td><input type="text" name="bname" size="60" value="${boardDto.bname }" readonly="readonly"></td>
		</tr>
		<tr>
			<td>제 목</td>
			<td><input type="text" name="btitle" size="60" value="${boardDto.btitle }"></td>
		</tr>
		<tr>
			<td>내 용</td>
			<td><textarea rows="10" cols="45" name="bcontent">${boardDto.bcontent }</textarea></td>
		</tr>	
		<tr>
			<td colspan="2">
				<input type="submit" value="완료">&nbsp;&nbsp;
				<input type="button" value="취소" onclick="javascript:window.location.href='list'">
			</td>
		</tr>
		</form>
	</table>
</body>
</html>