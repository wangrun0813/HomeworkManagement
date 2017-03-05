<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>管理员注册</title>
<style type="text/css">
.head {
	color: red;
	text-align: center;
	background-color: blue;
}

h3 {
	color: blue;
}
h2{
  text-align:center;
  width:150px;
  border-right:#222 3px solid;
  border-top:#ddd 3px solid;
  border-left:#ddd 3px solid;
  border-bottom:#222 3px solid;
  background-color:gray;
   color:PaleGreen;
}
</style>
</head>
<body>
	<h3 align="center">
	<a href="register.jsp">学生注册</a>&nbsp; &nbsp;
		<a href=tregister.jsp>老师注册</a>&nbsp; &nbsp;
			<a href=pregister.jsp> 家长注册</a>
	</h3>
	<form name="myform" method="post" action=register
		onsubmit="return validate();">
		<table width="600" border="0" align="center">
			<tr>
				<td colspan="2" align=center><h2>管理员注册</h2>
				</td>
			</tr>
			<tr>
				<td colspan="2" class="head">基本信息</td>
			</tr>
			<tr>
				<td width="90" align="right">用户名：</td>
				<td width="320"><input type="text" name="uname1">必须是英文数字或字母，最多20位</td>
			</tr>
			<tr>
				<td align="right">密码：</td>
				<td><input type="password" name="upwd1">英文字母或数字,最多20位</td>
			</tr>
			<tr>
				<td align="right">确认密码：</td>
				<td><input type="text" name="upwd2">
				</td>
			</tr>
			<tr>
				<td align="right">性别：</td>
				<td><input type="radio" name="male" id="radio" value="male">男
					<input type="radio" name="male" id="radio2" value="female">女
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="head">联系方式</td>
			</tr>
			<tr>
			<tr>
				<td align="right">联系电话：</td>
				<td><input type="text" name="textfield4">
				</td>
			</tr>
			<tr>
				<td align="right">Email</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td colspan="2" align=center><input type="submit" name="Submit"
					value="提交"> &nbsp;&nbsp; <input type="reset" name="Submit2"
					value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
