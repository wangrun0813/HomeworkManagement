<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>����Աע��</title>
<style type="text/css">
.head {
	color: red;
	text-align: center;
	background-color: blue;
}

h3 {
	color: blue;
}
h2{
  text-align:center;
  width:150px;
  border-right:#222 3px solid;
  border-top:#ddd 3px solid;
  border-left:#ddd 3px solid;
  border-bottom:#222 3px solid;
  background-color:gray;
   color:PaleGreen;
}
</style>
</head>
<body>
	<h3 align="center">
	<a href="register.jsp">ѧ��ע��</a>&nbsp; &nbsp;
		<a href=tregister.jsp>��ʦע��</a>&nbsp; &nbsp;
			<a href=pregister.jsp> �ҳ�ע��</a>
	</h3>
	<form name="myform" method="post" action=register
		onsubmit="return validate();">
		<table width="600" border="0" align="center">
			<tr>
				<td colspan="2" align=center><h2>����Աע��</h2>
				</td>
			</tr>
			<tr>
				<td colspan="2" class="head">������Ϣ</td>
			</tr>
			<tr>
				<td width="90" align="right">�û�����</td>
				<td width="320"><input type="text" name="uname1">������Ӣ�����ֻ���ĸ�����20λ</td>
			</tr>
			<tr>
				<td align="right">���룺</td>
				<td><input type="password" name="upwd1">Ӣ����ĸ������,���20λ</td>
			</tr>
			<tr>
				<td align="right">ȷ�����룺</td>
				<td><input type="text" name="upwd2">
				</td>
			</tr>
			<tr>
				<td align="right">�Ա�</td>
				<td><input type="radio" name="male" id="radio" value="male">��
					<input type="radio" name="male" id="radio2" value="female">Ů
				</td>
			</tr>
			
			<tr>
				<td colspan="2" class="head">��ϵ��ʽ</td>
			</tr>
			<tr>
			<tr>
				<td align="right">��ϵ�绰��</td>
				<td><input type="text" name="textfield4">
				</td>
			</tr>
			<tr>
				<td align="right">Email</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td colspan="2" align=center><input type="submit" name="Submit"
					value="�ύ"> &nbsp;&nbsp; <input type="reset" name="Submit2"
					value="����">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
