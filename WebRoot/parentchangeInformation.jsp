<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>�޸�����</title>
<script type="text/javascript">
	function validate() {
		//������֤
		if (document.mypswd.pswd.value == "") {
			alert(" ���������룡 ");
			return false;
		}
		if (document.mypswd.pswd1.value == "") {
			alert(" ��ȷ�����룡 ");
			return false;
		}
		if (document.mypswd.pswd.value != document.mypswd.pswd1.value) {
			alert(" �����������벻һ�£� ");
			return false;
		}
		alert(" ������ĳɹ��� �����µ�¼");
		return true;
	}
</script>
<style type="text/css">
#change {
	width: 350px;
	height: 300px;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color: PaleGreen;
	float: right;
	margin-right: 450px;
	margin-top: 60px;
	padding-top: 20px;
	text-align: center;
}
</style>
</head>
<body>
<jsp:include page="head3.jsp"></jsp:include>
	<div id="change">
		<form action="update1" method="post" name="mypswd" onsubmit="return validate();">
		<h3>�޸�����</h3><br>
			�µ�����<input type="password" name="pswd"><br><br><br><br>
			 ȷ������ <input type="password" name="pswd1"><br><br><br><br>
			<input type="submit" value="ȷ��"> &nbsp; &nbsp; &nbsp; &nbsp;
			<input type="reset" value="����">
		</form>
	</div>
	<jsp:include page="parentNavi.jsp"></jsp:include>
</body>
</html>