<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>��ʦ�γ�ѡ��ѧУ</title>
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
	padding-right: 300px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head4.jsp"></jsp:include>
	<div id="table">

			<table width="600" height="300" border="1" align="center">
			 <tr>
     <td>ѡ��ѧУ</td>
    <td>ȷ��</td>
  </tr>
 <c:forEach items="${university}" var="un">
  <tr>
     <td>${un.uname}</td>
     <td><a href="updateTeacherAction2.action?uid=${un.uid}">ȷ��</a></td> 
  </tr>
  </c:forEach>
		</table>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>