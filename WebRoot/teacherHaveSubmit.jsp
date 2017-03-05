<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>查看已经布置的作业</title>
<style type="text/css">
#info {
	padding-top: 90px;
	float: right;
	padding-right: 600px;
	text-align: center;
}
table {
	text-align: center;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color: gray;
	color:PaleGreen;
}
#table {
    padding-top:40px;
	float: right;
	padding-right: 300px;
	text-align: center;
	
}

#homework{
    color:PaleGreen;
}

</style>
</head>
<body>
     
	<jsp:include page="head2.jsp"></jsp:include>

	<div id="table">	
	<table width="600" height="300" border="1" align="center">

	<tr>
		        <td>科目</td> 
				<td>发布日期</td>
				<td>截止时间</td>
				<td>作业名</td>
			</tr>
	<c:forEach items="${homeworks}" var="ts">
	  <tr>
				    <td>${ts.id.course.cname}</td>
				    <td>${ts.sdate}</td>
					<td>${ts.tdate}</td>
					<td>${ts.uploadFileName}</td>
	  </tr>
	</c:forEach>
	</table>	
	</div>

	<jsp:include page="teacherNavi.jsp"></jsp:include>
</body>
</html>