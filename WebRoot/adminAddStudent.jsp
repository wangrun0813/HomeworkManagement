<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>增加学生</title>
<style type="text/css">
table {
	text-align: center;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color: PaleGreen;
}

#table {
	padding-top: 40px;
	float: right;
	padding-right: 350px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head4.jsp"></jsp:include>
	<div id="table">
		<form action="addStudent.action" method="post" name="mystudent"
			onsubmit="return validate();">
			<table width="600" height="300" border="1" align="center">

				<tr>
					<td colspan="4" align=center>增加学生</td>
				</tr>
				<tr>
					<td>编号</td>
					<td><input type="text" name="sid"></td>
					<td>学号</td>
					<td><input type="text" name="sno"></td>
				</tr>

				<tr>
					<td>姓名</td>
					<td><input type="text" name="sname">
					</td>
					<td>初始密码</td>
					<td><input type="password" name="pswd"></td>

				</tr>

				<tr>
					<td>邮箱</td>
					<td><input type="text" name="semail"></td>
					<td>班级</td>
					<td><input type="text" name="sclass"></td>
				</tr>

				<tr>
					<td>学校</td>

					<td><select name="uname" size=1>
							<c:forEach items="${university}" var="un">
								<option value="${un.uname}">${un.uname}</option>
							</c:forEach>
					</select>
					</td>

					<td>性别</td>
					<td><input type="radio" name="ssex" id="radio" value="男">男
						<input type="radio" name="ssex" id="radio2" value="女">女</td>
				</tr>


				<td colspan="4" align=center><input type="submit" name="Submit"
					value="提交">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"
					name="Submit2" value="重置">
				</td>
			</table>
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>