<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@page import="com.model.Teach"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<style type="text/css">
table {
	text-align: center;
	border-right: #222 3px solid;
	border-top: #ddd 3px solid;
	border-left: #ddd 3px solid;
	border-bottom: #222 3px solid;
	background-color:gray;
	color:PaleGreen;
}
#table {
    padding-top:40px;
	float: right;
	padding-right: 250px;
	text-align: center;
	
}
</style>
</head>
<body>
 <jsp:include page="head2.jsp"></jsp:include>
  <div id="table">
  <form action="fileUpload.action" method="post" enctype="multipart/form-data">
  <table width="800" border="1" align="center">
  <tr>
     <td width="100" height="100"  align="center">�༶</td>
      <td><input name="sclass" value="${param.sclass}"></td>
   
     <td>�γ̺�</td>
     <td><input name="Cid" value="${param.cid}"></td>
  </tr>
  <tr>
      <td width="100" height="100"  align="center">����ʱ��</td>
     <td><input type="date" name="sdate"></td>
     <td>��ֹʱ��</td>
     <td><input type="date" name="tdate"></td>
  </tr>
  <tr>
   <td  width="100" height="100"  align="center">��ҵ����</td>
     <td><input type=text name="title"></td>      
      <td >������ҵ</td>
    <td ><a href="ueditor/index.html">���ı�</a></td>
  </tr>
  
  <tr>
    <td colspan="4"  height="50"><input type="submit" value="�ϴ�">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;<input type="reset" value="����"></td>
  </tr>
 
  </table>
  </form>
  </div>
 <jsp:include page="teacherNavi.jsp"></jsp:include>

</body>
</html>