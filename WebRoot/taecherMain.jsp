<%@ page language="java" contentType="text/html;  charset=GB18030"
	pageEncoding="GB18030"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.Teacher"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>教师操作页面</title>
<style type="text/css">
#info {
padding-top:90px;
	float: right;
	padding-right: 600px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head2.jsp"></jsp:include>
	<div id="info">
		<h4>欢迎${teacher.tname}！</h4>
		<h4>性别${teacher.tsex}:</h4>
	</div>

	<jsp:include page="teacherNavi.jsp"></jsp:include>
</body>
</html>