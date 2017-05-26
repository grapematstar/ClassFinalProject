<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="studentmemberJoin.do" method="POST">
	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" name="id" required="required"></td>
		</tr>
		<tr>
			<th>pwd</th>
			<td><input type="password" name="pwd" required="required"></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" required="required"></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="text" name="tel"></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><input type="text" name="email" required="required"></td>
		</tr>
		<tr>
			<th>학교</th>
			<td><input type="text" name="school"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="확인"></td>
		</tr>
	</table>
</form>
</body>
</html>