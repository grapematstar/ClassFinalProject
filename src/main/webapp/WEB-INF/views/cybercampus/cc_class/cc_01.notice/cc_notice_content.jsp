<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>작성날짜</th><td></td>
			<th>글쓴이</th><td></td>
			<th>제목</th><td></td>
			<th>첨부파일</th><td></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td colspan="4"><!-- 본문내용 --></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td><!-- 이전 글 --></td>
		</tr>
		<tr>
			<td><!-- 다음 글 --></td>
		</tr>
	</tfoot>
</table>
<input type="button" value="수정"><!-- 강사전용 -->
<input type="button" value="댓글">
<input type="button" value="닫기">
</body>
</html>