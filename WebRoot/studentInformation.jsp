<%@ page language="java" contentType="text/html; charset=GB18030"  import="com.dao.*"
	pageEncoding="GB18030"%>
	<%@page import="com.model.Student"%>
	
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
    padding-top:60px;
	float: right;
	padding-right: 250px;
	text-align: center;
	
}
</style>
</head>
<body>
    <%
    	Student student = (Student)session.getAttribute("student");    
     %>
 
    <jsp:include page="head.jsp"></jsp:include>
    <div id="table">
	<table width="600" height="300" border="1" align="center">
		<tr>
			<td colspan="4" align=center><h2>������Ϣ</h2></td>
		</tr>
		<tr>
			<td width="150" align="right">�û�����</td>
			<td width="150">${student.sid}</td>
			<td width="150" align="right">�༶�ţ�</td>
			<td width="150">${student.sclass}</td>
		</tr>
		<tr>
		    <td width="150" align="right">������</td>
			<td width="150">${student.sname}</td>
			<td width="150" align="right">ѧ�ţ�</td>
			<td width="150">${student.sno}</td>
			
		</tr>
		<tr>
		    <td width="150" align="right">�Ա�</td>
			<td width="150">${student.ssex}</td>
			<td width="150" align="right">���䣺</td>
			<td width="150">${student.semail}</td>
		</tr>
	</table>
	</div>
<jsp:include page="studentNavi.jsp"></jsp:include>
</body>
</html>