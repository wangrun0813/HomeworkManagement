<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>安排老师课程</title>
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
		<form action="savecourse.action" method="post">

			<table width="600" height="300" border="1" align="center">
				<tr>
					<td width="150">班级</td>
					<td width="150">课程号</td>
					<td width="150">教师</td>
					<td width="150">确定</td>
				</tr>

				<tr>

					<td><select name="sclass" size=1>
							<c:forEach items="${sclassinfo}" var="sc">
								<option value="${sc.sclass}">${sc.sclass}</option>
							</c:forEach>
					</select>
					</td>


					<td><select name="Cid" size=1>
							<c:forEach items="${cidinfo}" var="cinfo">
								<option value="${cinfo.cid}">${cinfo.cid}</option>
							</c:forEach>
					</select>
					</td>

					<td><select name="tid" size=1>
							<c:forEach items="${teainfo}" var="tea">
								<option value="${tea.tid}">${tea.tid}</option>
							</c:forEach>
					</select>
					</td>
					<td>
					  <input type="submit" name="Submit" value="提交">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="adminNavi.jsp"></jsp:include>
</body>
</html>