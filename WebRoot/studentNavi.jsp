<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>学生导航栏</title>
<style type="text/css">
.navi {
	text-align: center;
	width: 100px;
	height: 100% border-right:#222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
}

#line {
	border: 10px;
}

a {
	color: PaleGreen;
}
</style>
</head>
<body>

	<div id="line">
		<ul>
			<br>
			<br>
			<li class="navi"><a href="studentMain.jsp">我的首页</a>
			</li>
			<br>
			<li class="navi"><a href="studentInformation.jsp">我的信息</a>
			</li>
			<br>
			<li class="navi"><a href="StudentChangeInformation.jsp">修改密码</a>
			</li>
			<br>
			<li class="navi"><a href="Studentdownload.jsp">作业下载</a>
			</li>
			<br>
			<li class="navi"><a href="studentInformation.jsp">作业上传</a>
			</li>
			<br>
			<li class="navi"><a href="studentInformation.jsp">查看成绩</a>
			</li>
			<br>
			<li class="navi"><a href="studentInformation.jsp">往期作业</a>
			</li>
			<br>
			<li class="navi"><a href="UI2.jsp">退出登录</a>
			</li>
			<br>
		</ul>
	</div>

</body>
</html>