<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@page import="com.dao.UserDao"%>
<%@page import="com.model.Teacher"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>��ʦ��Ϣ</title>
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

    <jsp:include page="head2.jsp"></jsp:include>
    <div id="table">
	<table width="600" height="300" border="1" align="center">
		<tr>
			<td colspan="4" align=center><h2>������Ϣ</h2></td>
		</tr>
		<tr>
			<td width="150" align="right">�û�����</td>
			<td width="150">${teacher.tid}</td>
			<td width="150" align="right">�绰��</td>
			<td width="150">${teacher.tphone}</td>
		</tr>
		<tr>
		    <td width="150" align="right">������</td>
			<td width="150">${teacher.tname}</td>
			<td width="150" align="right">���ţ�</td>
			<td width="150">${teacher.tno}</td>
			
		</tr>
		<tr>
		    <td width="150" align="right">�Ա�</td>
			<td width="150">${teacher.tsex}</td>
			<td width="150" align="right">���䣺</td>
			<td width="150">${teacher.temail}</td>
		</tr>
	</table>
	</div>
<jsp:include page="teacherNavi.jsp"></jsp:include>
</body>
</html>