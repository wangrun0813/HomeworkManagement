<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>ѧ��ע��</title>
<script type="text/javascript">
	function validate() {
		//�û�����֤
		if (document.myform.sid.value == "") {
			alert(" �������û����� ");
			return false;
		}
		//������֤
		if (document.myform.spswd.value == "") {
			alert(" ���������룡 ");
			return false;
		}
		if (document.myform.spswd1.value == "") {
			alert(" ��ȷ�����룡 ");
			return false;
		}
		if (document.myform.spswd.value != document.myform.spswd1.value) {
			alert(" �����������벻һ�£� ");
			return false;
		}
		//�ֻ�����֤
		if(document.myform.textfield4.value==""){
			alert("�������ֻ�����");
			return false;
		}
		if(document.myform.textfield4.value.length!=11){
			alert("�ֻ���Ӧ����11λ");
			return false;
		}
	    if(document.myform.textfield4.value.substring(0,1)!="1"){
	    	 alert(" �ֻ�����Ӧ���� 1 ��ͷ "); 
	    	 return false;
	    }
	    if(isNaN(document.myform.textfield4.value)){
	    	alert(" �ֻ�����Ӧ���� 11 λ���� "); 
	    	return false;
	    }
		alert(" ע��ɹ��� ");
		return true;
	}
</script>
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
		<a href=tregister.jsp>��ʦע��</a>&nbsp; &nbsp; 
		<a href=aregister.jsp>����Աע��</a>&nbsp;&nbsp;
		<a href=pregister.jsp> �ҳ�ע��</a>
	</h3>
	<form name="myform" method="post" action=register
		onsubmit="return validate();">
		<table width="600" border="0" align="center">
			<tr>
				<td colspan="2" align=center><h2>ѧ��ע��</h2>
				</td>
			</tr>
			<tr>
				<td colspan="2" class="head">������Ϣ</td>
			</tr>
			<tr>
				<td width="90" align="right">�û�����</td>
				<td width="320"><input type="text" name="sid">������s��ͷ��7λ���֡��硰s2013001��</td>
			</tr>
			<tr>
				<td width="90" align="right">������</td>
				<td width="320"><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td width="90" align="right">ѧ�ţ�</td>
				<td width="320"><input type="text" name="sno"></td>
			</tr>
			<tr>
				<td align="right">���룺</td>
				<td><input type="password" name="spswd">Ӣ����ĸ������,���20λ</td>
			</tr>
			<tr>
				<td align="right">ȷ�����룺</td>
				<td><input type="text" name="spswd2">
				</td>
			</tr>
			<tr>
				<td align="right">�Ա�</td>
				<td><input type="radio" name="ssex" id="radio" value="��">��
					<input type="radio" name="ssex" id="radio2" value="Ů">Ů
				</td>
			</tr>
			<tr>
				<td align="right">ѧУ</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td align="right">�༶</td>
				<td><input type="text" name="sclass"></td>
			<tr>
			<tr>
				<td colspan="2" class="head">��ϵ��ʽ</td>
			</tr>
			<tr>
				<td align="right">Email</td>
				<td><input type="text" name="semail"></td>
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
