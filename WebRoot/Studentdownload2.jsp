<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>��ҵ����</title>
<<style type="text/css">
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
	padding-right:200px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="table">
		<table width="800" height="300" border="1" align="center">
			<tr>
		
				<td width="150" >����ʱ��</td>
				<td width="150">��ֹʱ��</td>
				<td width="150">��ҵ��</td>
				<td width="200">����</td>
				<td width="150">ȫ������</td>
					<td width="150">����</td>

			</tr>
			<c:forEach items="${homeworks}" var="home">
				<tr>
				   
				    <td>${home.sdate}</td>
					<td>${home.tdate}</td>
					<td>${home.uploadFileName}</td>
					<td>${home.editorValue}</td>
				    <td><a href="show.action?cid=${home.id.course.cid}&sclass=${home.id.sclass.sclass}&tid=${home.id.teacher.tid}&title=${home.id.title}">��ʾ</a>
					<td><a href="download.action?uploadFileName=${home.uploadFileName}">������ҵ</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<jsp:include page="studentNavi.jsp"></jsp:include>

</body>
</html>