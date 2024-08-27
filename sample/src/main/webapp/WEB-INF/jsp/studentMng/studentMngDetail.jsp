<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
  src="https://code.jquery.com/jquery-3.7.1.js"
  integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
  crossorigin="anonymous"></script>
<title>학생정보</title>

</head>
<body>
	<form id="jsonFrm" name="jsonFrm">
		<input type="hidden" id="studentId" name="studentId" value=""/>
	</form>
	<table style="border: 1px solid #444444;">
	<thead>
		<tr>
			<th style="border: 1px solid #444444;">이름</th>
			<td style="border: 1px solid #444444;">${studentInfo.studentName }</td>
		</tr>
		<tr>	
			<th style="border: 1px solid #444444;">학교명</th>
			<td style="border: 1px solid #444444;">${studentInfo.schoolName }</td>
		</tr>
		<tr>
			<th style="border: 1px solid #444444;">졸업여부</th>
			<td style="border: 1px solid #444444;">${studentInfo.studentGraduateYn }</td>
		</tr>
	</thead>
	</table>
	<a href="/studentMng/getStudentList.do">목록으로</a>
</body>
</html>