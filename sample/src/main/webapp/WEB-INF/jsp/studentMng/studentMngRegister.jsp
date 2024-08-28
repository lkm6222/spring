<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.js"
	  integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	  crossorigin="anonymous">
</script>
<title>등록</title>
<script type="text/javascript">
	$(document).ready(function(){

	});
	
	function fn_insertStudent(){
 		var frm = $("#frm").serialize();
//		console.log(frm);
		
		$.ajax({
			url : '/studentMng/insertStudentMng.do',
			method : 'post',
			data : frm,
			dataType : 'json',
		    success: function (data, status, xhr) {
		        //console.log(data);
		        alert("등록되었습니다.");
				location.href = '/studentMng/getStudentList.do';
		    },
		    error: function (data, status, err) {
		    }
		})
	}
</script>
</head>
<body>

<form id="frm" name="frm">
	<table>
		<tr>
			<th>학생 이름</th>
			<td>
				<input type="text" id="studentName" name="studentName" value=""/>
			</td>
		</tr>
		<tr>
			<th>학교명</th>
			<td>
				<select id="schoolId" name="schoolId">
					<option value="">--학교를 선택해주세요--</option>
					<c:forEach var="schoolList" items="${schoolList }">
						<option value="${schoolList.schoolId }">${schoolList.schoolName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<th>졸업여부</th>
			<td>
				<input type="text" id="graduateYn" name="graduateYn" value=""/>
			</td>
		</tr>
	</table>
</form>
<a href="javascript:fn_insertStudent();">등록</a>
</body>
</html>