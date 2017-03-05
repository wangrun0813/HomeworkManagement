<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@page import="com.model.Parent"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>家长操作页面</title>
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
<%
    Parent parent=(Parent)session.getAttribute("parent"); 
 %>
	<jsp:include page="head3.jsp"></jsp:include>
	<div id="info">
	   
		<h4>欢迎您！</h4>
		 <h4>ID:${parent.pid}</h4>
		<h4>子女:${parent.student.sname}</h4>
	</div>

	<jsp:include page="parentNavi.jsp"></jsp:include>
</body>
</html>