<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>��½</title>
<script type="text/javascript">
	function validate() {
		//������֤
		if (document.mylog.id.value == "") {
			alert("�������û����� ");
			return false;
		}
		if (document.mylog.pswd.value == "") {
			alert(" ���������룡 ");
			return false;
		}
		return true;
	}
</script>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="introduce" >
		<h3>��ӭ������ҵ����ϵͳ</h3><br>
		<h4>
		����Ա�û���:a+8λ����<br>
		��ʦ�û���Ϊ:t+8λ����<br>
		ѧ���û���Ϊ:s+8λ����<br>	
		</h4>
		</div>
		<div class="container">
			<h1 >��ҵ����ƽ̨</h1>			
			<form class="form" action="Login.action" method="post" name="mylog" onsubmit="return validate();">
				<input type="text" placeholder="Username" name="id"><br>
				<input type="password" placeholder="Password" name="pswd"><br>
				<button type="submit" id="login-button">Login</button><br></br>
				<a href=password.jsp>�������룿</a>&nbsp;&nbsp;&nbsp;
				<a href="register.jsp">���û�ע��</a>
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