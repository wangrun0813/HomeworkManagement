<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
	<%@page import="com.model.Admin"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>管理员主页</title>
<style type="text/css">
#info {
	padding-top: 90px;
	float: right;
	padding-right: 600px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head4.jsp"></jsp:include>
	<div id="info">
		<h3>欢迎${admin.aname}!</h3>

	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>