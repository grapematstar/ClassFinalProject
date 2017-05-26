<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>질의응답</title>
</head>
<body>
<form name="" action="" method="POST">
<table>
	<thead>
		<tr>
			<th>작성날짜</th><td></td>
			<th>글쓴이</th><td></td>
			<th>제목</th><td></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td colspan="3"><textarea><!-- 본문내용 --></textarea></td>
		</tr>
	</tbody>
	<tfoot>
	</tfoot>
</table>
<input type="file">
<input type="button" value="저장">
<input type="button" value="닫기">
</form>
</body>
</html>