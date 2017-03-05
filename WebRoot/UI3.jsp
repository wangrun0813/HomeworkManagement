<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>登陆失败</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="introduce" >
		<h3>欢迎来到作业管理系统</h3><br>
		<h4>
		管理员用户名:a+8位数字<br>
		教师用户名为:t+8位数字<br>
		学生用户名为:s+8位数字<br>	
		</h4>
		</div>
		<div class="container">
			<h1 >作业管理平台</h1>			
			<form class="form" action="Login" method="post" name="mylog" onsubmit="return validate();">用户名或密码错误
				<input type="text" placeholder="Username" name="id" ><br>
				<input type="password" placeholder="Password" name="pswd"><br>
				<button type="submit" id="login-button">Login</button><br></br>
				<a href=password.jsp>忘记密码？</a>&nbsp;&nbsp;&nbsp;
				<a href="register.jsp">新用户注册</a>
			</form>
		</div>
			
		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>	
	</div>
</div>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>



</body>
</html>