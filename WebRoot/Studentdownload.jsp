<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@page import="com.dao.StudentDao"%>
<%@page import="com.model.Student"%>
<%@page import="com.model.Teach"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>��ҵѡ�����ؽ���</title>
<style type="text/css">
table {
	text-align: center;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color: PaleGreen;
}

#table {
	padding-top: 40px;
	float: right;
	padding-right: 300px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="table">
		<table width="600" height="300" border="1" align="center">
			<tr>
				<td>��Ŀ</td>
				<td>�༶</td>
				<td>��ʦ</td>
				<td>ѡ������</td>

			</tr>
			<c:forEach items="${teach}" var="tea">
				<tr>
					<td>${tea.id.course.cname}</td>
					<td>${tea.id.sclass.sclass}</td>
					<td>${tea.id.teacher.tname}</td>
					<td><a href="dwAction.action?cid=${tea.id.course.cid}&sclass=${tea.id.sclass.sclass}&tid=${tea.id.teacher.tid}">ѡ������</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<jsp:include page="studentNavi.jsp"></jsp:include>


</body>
</html>