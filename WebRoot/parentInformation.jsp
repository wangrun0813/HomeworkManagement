<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@page import="com.model.Parent"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>ѧ����Ϣ</title>
<style type="text/css">
table {
	text-align: center;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color:PaleGreen;
}
#table {
    padding-top:40px;
	float: right;
	padding-right: 250px;
	text-align: center;
	
}
</style>
</head>
<body>
<%
    Parent parent=(Parent)session.getAttribute("parent"); 
 %>
    <jsp:include page="head.jsp"></jsp:include>
    <div id="table">
	<table width="600" height="300" border="1" align="center">
		<tr>
			<td colspan="4" align=center><h2>������Ϣ</h2></td>
		</tr>
		<tr>
			<td width="150" align="right">�û�����</td>
			<td width="150">${parent.pid}</td>
			<td width="150" align="right">��Ů��</td>
			<td width="150">${parent.student.sname}</td>
		</tr>

		<tr>
		    <td width="150" align="right">�绰��</td>
			<td width="150">${parent.ptel}</td>
			<td width="150" align="right">���䣺</td>
			<td width="150">${parent.pemail}</td>
		</tr>
	</table>
	</div>
<jsp:include page="parentNavi.jsp"></jsp:include>
</body>
</html>