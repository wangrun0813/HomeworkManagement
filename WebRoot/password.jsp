<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>�û������һ�</title>
<style type="text/css">
#pass{
    margin-left:400px;
    margin-top:100px;
    text-align: center;
	width: 400px;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color:PaleGreen;
}
a{
color:PaleGreen;
}
</style>
</head>
<body>
<jsp:include page="head1.jsp"></jsp:include>
<div id="pass">

	<h3>���������ע������</h3>
	<form action=UI.jsp method="post" id="repasseord">
		<input type="text" name="uname1">
		<input type="submit" value="�ύ">
		<h3>�����뽫�����������</h3><br>
		<a href="UI2.jsp">���ص�½ҳ</a>
	</form>
</div>	
</body>
</html>