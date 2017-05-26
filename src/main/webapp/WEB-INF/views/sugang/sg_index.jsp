<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
						<td colspan="2">수강생 : 관리자</td>
					</tr>
					</table>
					<br/>
				<table id="content_body_table1">
					<tr>
						<td rowspan="2">
							<table border="1" cellpadding="0" cellspacing="0"
								style="margin: 0">
								<thead>
									<tr align="center">
										<th><input type="checkbox" id="selectCurAll"></th>
										<th>아이디</th>
										<th>이름</th>
										<th>전화번호</th>
										<th>이메일</th>
										<th>학교</th>
										<th>학년</th>
									</tr>
								</thead>
								<tbody>
								  <c:if test="${empty list}">
									<tr>
										<td>등록된 게시물이 없습니다.</td>
									</tr>
								  </c:if>
								  <c:forEach var="dto" items="${list}">
								  	<tr align="center">
								  		<td><input type="checkbox" id="selectCurBtn"></td>
								  		<td>${dto.stu_id}</td>
								  		<td>${dto.stu_name}</td>
								  		<td>${dto.stu_tel}</td>
								  		<td>${dto.stu_email}</td>
								  		<td>${dto.stu_school}</td>
								  		<td>${dto.stu_grade}</td>
								  	</tr>
								  </c:forEach>
								</tbody>
							</table>
						</td>
						<td>
						</td>
					</tr>
					
				</table>
				<br/>
				<table id="content_body_table2">
					<tr>
						<th><input type="checkbox" id="selectCurAll"></th>
						<th>아이디</th>
						<th>이름</th>
						<th>전화번호</th>
						<th>이메일</th>
						<th>학교</th>
						<th>학년</th>
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

	$(function(){
		//전체선택 체크박스 클릭
		$("#selectCurAll").click(function(){
			//만약 체크박스가 선택된 상태일 경우,
			if($("#selectCurAll").prop("checked")){
				//해당화면에 전체 checkbox를 체크해준다.
				$("input[type=checkbox]").prop("checked",true);
			//전체 체크박스가 해제된 상태일 경우,
			}else{
				//해당 화면의 모든 checkbox의 체크를 해제한다.
				$("input[type=checkbox]").prop("checked",false);
			}
		});
	});
</script>
</html>