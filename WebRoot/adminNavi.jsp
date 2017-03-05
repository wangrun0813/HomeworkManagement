<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>管理员导航栏</title>
<style type="text/css">
.navi {
	text-align: center;
	width: 100px;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
}
a {
	color: PaleGreen;
}
</style>
</head>
<body>

	<div>
		<ul>
		</br></br>
			<li class="navi"><a href="adminMain.jsp">我的首页</a>
			</li>
			</br>
			<li class="navi"><a href="adminInformation.jsp">我的信息</a>
			</li>
			</br>
			<li class="navi"><a href="adminchangeInformation.jsp">修改密码</a>
			</li>
			</br>
			<li class="navi"><a href="adminTeaChoSchool.jsp">修改老师信息</a>
			</li>
			</br>
			<li class="navi"><a href="adminStuChoSchool.jsp">修改学生信息</a>
			</li>
			</br>
			<li class="navi"><a href="adminTeaChoseCouse.jsp">教师课程</a>
			</li>
			</br>
			<li class="navi"><a href="adminAddSchool.jsp">增加学校</a>
			</li>
			</br>
			<li class="navi"><a href="adminAddTeacher.jsp">增加教师</a>
			</li>
			</br>
			<li class="navi"><a href="adminAddStudent.jsp">增加学生</a>
			</li>
			</br>
			<li class="navi"><a href="UI2.jsp">退出登录</a>
			</li>
			</br>
		</ul>
	</div>
</body>
</html>