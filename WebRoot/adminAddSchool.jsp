<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>����ѧУ</title>
<script type="text/javascript">
	function validate() {
		//�û�����֤
		if (document.myschool.uid.value == "") {
			alert(" ������ѧУid�� ");
			return false;
		}
		if (document.myschool.uname.value == "") {
			alert(" ������ѧУ���ƣ� ");
			return false;
		}
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
<jsp:include page="head4.jsp"></jsp:include>
	<div id="change">
		<form action="addSchool.action" method="post" name="myschool" onsubmit="return validate();">
		<h3>����ѧУ</h3><br>
			ѧУ���<input type="text" name="uid"><br><br><br><br>
			ѧУ���� <input type="text" name="uname"><br><br><br><br>
			ѧУ���� <input type="text" name="uemail"><br><br><br><br>
			<input type="submit" value="ȷ��"> &nbsp; &nbsp; &nbsp; &nbsp;
			<input type="reset" value="����">
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>