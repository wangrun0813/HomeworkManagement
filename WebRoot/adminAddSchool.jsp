<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>增加学校</title>
<script type="text/javascript">
	function validate() {
		//用户名验证
		if (document.myschool.uid.value == "") {
			alert(" 请输入学校id！ ");
			return false;
		}
		if (document.myschool.uname.value == "") {
			alert(" 请输入学校名称！ ");
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
		<h3>增加学校</h3><br>
			学校编号<input type="text" name="uid"><br><br><br><br>
			学校名称 <input type="text" name="uname"><br><br><br><br>
			学校邮箱 <input type="text" name="uemail"><br><br><br><br>
			<input type="submit" value="确认"> &nbsp; &nbsp; &nbsp; &nbsp;
			<input type="reset" value="重置">
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>