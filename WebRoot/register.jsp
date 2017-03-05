<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>学生注册</title>
<script type="text/javascript">
	function validate() {
		//用户名验证
		if (document.myform.sid.value == "") {
			alert(" 请输入用户名！ ");
			return false;
		}
		//密码验证
		if (document.myform.spswd.value == "") {
			alert(" 请输入密码！ ");
			return false;
		}
		if (document.myform.spswd1.value == "") {
			alert(" 请确认密码！ ");
			return false;
		}
		if (document.myform.spswd.value != document.myform.spswd1.value) {
			alert(" 两次密码输入不一致！ ");
			return false;
		}
		//手机号验证
		if(document.myform.textfield4.value==""){
			alert("请输入手机号码");
			return false;
		}
		if(document.myform.textfield4.value.length!=11){
			alert("手机号应该是11位");
			return false;
		}
	    if(document.myform.textfield4.value.substring(0,1)!="1"){
	    	 alert(" 手机号码应该以 1 开头 "); 
	    	 return false;
	    }
	    if(isNaN(document.myform.textfield4.value)){
	    	alert(" 手机号码应该是 11 位数字 "); 
	    	return false;
	    }
		alert(" 注册成功！ ");
		return true;
	}
</script>
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
		<a href=tregister.jsp>老师注册</a>&nbsp; &nbsp; 
		<a href=aregister.jsp>管理员注册</a>&nbsp;&nbsp;
		<a href=pregister.jsp> 家长注册</a>
	</h3>
	<form name="myform" method="post" action=register
		onsubmit="return validate();">
		<table width="600" border="0" align="center">
			<tr>
				<td colspan="2" align=center><h2>学生注册</h2>
				</td>
			</tr>
			<tr>
				<td colspan="2" class="head">基本信息</td>
			</tr>
			<tr>
				<td width="90" align="right">用户名：</td>
				<td width="320"><input type="text" name="sid">必须以s开头加7位数字。如“s2013001”</td>
			</tr>
			<tr>
				<td width="90" align="right">姓名：</td>
				<td width="320"><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td width="90" align="right">学号：</td>
				<td width="320"><input type="text" name="sno"></td>
			</tr>
			<tr>
				<td align="right">密码：</td>
				<td><input type="password" name="spswd">英文字母或数字,最多20位</td>
			</tr>
			<tr>
				<td align="right">确认密码：</td>
				<td><input type="text" name="spswd2">
				</td>
			</tr>
			<tr>
				<td align="right">性别：</td>
				<td><input type="radio" name="ssex" id="radio" value="男">男
					<input type="radio" name="ssex" id="radio2" value="女">女
				</td>
			</tr>
			<tr>
				<td align="right">学校</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td align="right">班级</td>
				<td><input type="text" name="sclass"></td>
			<tr>
			<tr>
				<td colspan="2" class="head">联系方式</td>
			</tr>
			<tr>
				<td align="right">Email</td>
				<td><input type="text" name="semail"></td>
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
