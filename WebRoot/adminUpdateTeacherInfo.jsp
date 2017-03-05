<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>修改信息</title>
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
	padding-right: 200px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head4.jsp"></jsp:include>
	<div id="table">
   <form action="updateTeacherInfoAction2.action" method="post">
			<table width="800" height="300" border="1" align="center">
			 <tr>
     <td width="60">用户名</td>
      <td  width="60">邮箱</td>
      <td width="60">电话</td>    
     <td width="40">修改</td>         
  </tr>

  <tr>
     <td>${param.tid}</td>
     <td><input type="text" value="${param.temail}"  size="14" name="temail"></td>
     <td><input type="text" value="${param.tphone}"  size="14" name="tphone"></td>   
     <td><input type="submit" value="确认修改"></td>                       
  </tr>
		</table>
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>