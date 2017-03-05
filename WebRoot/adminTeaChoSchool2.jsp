<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>修改老师信息</title>
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
   <form>
			<table width="800" height="300" border="1" align="center">
			 <tr>
     <td width="60">用户名</td>
    <td width="60">工号</td>
     <td width="40">姓名</td>
     <td width="40">性别</td>
      <td  width="60">邮箱</td>
      <td width="60">电话</td>    
       <td width="40">删除</td>
     <td width="40">修改</td>         
  </tr>
<c:forEach items="${tinfo}" var="tin">
  <tr>
     <td>${tin.tid}</td>
     <td>${tin.tno}</td>
     <td>${tin.tname}</td>
     <td>${tin.tsex}</td>
     <td>${tin.temail}</td>
     <td>${tin.tphone}</td>   
     <td><a href="deleteTeacherAction.action?tid=${tin.tid}">删除</a></td>
     <td><a href="updateTeacherInfoAction.action?tid=${tin.tid}&temail=${tin.temail}&tphone=${tin.tphone}">修改</a></td>                       
  </tr>
  </c:forEach>
		</table>
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>