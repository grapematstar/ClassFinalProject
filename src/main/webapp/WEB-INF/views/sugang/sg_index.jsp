<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학원관리프로그램</title>
</head>
<body>
<div id="page_wrapper">
<%@include file="../../../header.jsp" %>
<!-- 본문 -->
		<div id="page_content_wrapper">
			<div class="container_fluid">
				<table id="content_header_table" border="1" cellspacing="0"
					ceallpadding="0">
					<tr align="right">
						<td colspan="2" align="right"><img alt="" src="#">수강생님
							로그인</td>
					</tr>
					<tr>
						<td align="left">수강신청</td>
						<td align="right"><input type="button" value="삭제"
							onclick="deleteCur()"></td>
					</tr>
					<tr>
						<td>수강생 : 관리자</td>
					</tr>
					<tr>
						<td rowspan="2">
							<table border="1" cellpadding="0" cellspacing="0"
								style="margin: 0">
								<thead>
									<tr align="center">
										<td><input type="checkbox" id="selectAll"></td>
										<td>강의CODE</td>
										<td>과목명</td>
										<td>종류</td>
										<td>담당강사</td>
										<td>강의상세</td>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="checkbox" id="selectBtn"></td>
										<td>A019290</td>
										<td>국어</td>
										<td>문학</td>
										<td>세종대왕</td>
										<td>훈민정음</td>
									</tr>
								</tbody>
							</table>
						</td>
						<td>
							<table border="1" cellspacing="0" ceallpadding="0">
								<thead>
									<tr align="center">
										<td><input type="checkbox" id="selectAll"></td>
										<td>강의CODE</td>
										<td>과목명</td>
										<td>종류</td>
										<td>담당강사</td>
										<td>강의상세</td>
									</tr>
								</thead>
								<tbody>
									<tr align="center">
										<td><input type="checkbox" id="selectBtn"></td>
										<td>B090041</td>
										<td>수학</td>
										<td>이산수학</td>
										<td>피타고라스</td>
										<td>이산수학의 개념</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr>
						<td><input type="button" value="수강신청확정" onclick="updateCur()"></td>
					</tr>
				</table>
			</div>
		</div>
		<!-- 본문 끝 -->
</div>
</body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script>
	myWidth = screen.availWidth;
	myHeight = screen.availHeight;	
	
	if(myWidth >= 1500){
		window.resizeTo(myWidth-400,myHeight-100);
	}else if(myWidth >= 1280){
		window.resizeTo(myWidth-200,myHeight-100);
	}
</script>
</html>