<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>������ҵ</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script type="text/javascript" charset="utf-8" src="ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor.all.min.js"> </script>
    <!--�����ֶ��������ԣ�������ie����ʱ��Ϊ��������ʧ�ܵ��±༭������ʧ��-->
    <!--������ص������ļ��Ḳ������������Ŀ����ӵ��������ͣ���������������Ŀ�����õ���Ӣ�ģ�������ص����ģ�������������-->
    <script type="text/javascript" charset="utf-8" src="lang/zh-cn/zh-cn.js"></script>

    <style type="text/css">
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
	padding-right: 20px;
	text-align: center;
	
}
    </style>
</head>
<body>
<form action="editor.action" method="post" enctype="multipart/form-data">
<div id="table">
<table width="400" border="1" align="center">
  <tr>
     <td width="100" height="100"  align="center">�༶</td>
      <td><input name="sclass" value="${param.sclass}"></td>
  </tr>
   <tr>
     <td height="100" >�γ̺�</td>
     <td><input name="Cid" value="${param.cid}"></td>
  </tr>
  <tr>
      <td width="100" height="100"  align="center">����ʱ��</td>
     <td><input type="date" name="sdate"></td>
     </tr>
     <tr>
     <td height="100" >��ֹʱ��</td>
     <td><input type="date" name="tdate"></td>
  </tr>
  <tr>
   <td  width="100" height="100"  align="center">��ҵ����</td>
     <td><input type=text name="title"></td> 
     </tr>
     </tr>
           <td >ѡ���ļ�</td>
    <td align="right"><input type="file" name="upload"></td>
  </tr>
  
  <tr>
    <td colspan="4"  height="50"><input type="submit" value="�ϴ�"></td>
  </tr>
  </table>
  </div>
<div>
    <h1>������ҵ</h1>
    <script id="editor" type="text/plain" style="width:800px;height:500px;"></script>
</div>
<div id="btns">
    <div>
        <button onclick="getAllHtml()">�������html������</button>
        <button onclick="getContent()">�������</button>
        <button onclick="setContent()">д������</button>
        <button onclick="setContent(true)">׷������</button>
        <button onclick="getContentTxt()">��ô��ı�</button>
        <button onclick="getPlainTxt()">��ô���ʽ�Ĵ��ı�</button>
        <button onclick="hasContent()">�ж��Ƿ�������</button>
        <button onclick="setFocus()">ʹ�༭����ý���</button>
        <button onmousedown="isFocus(event)">�༭���Ƿ��ý���</button>
        <button onmousedown="setblur(event)" >�༭��ʧȥ����</button>
    </div>
    
    <div>
        <button onclick="getText()">��õ�ǰѡ�е��ı�</button>
        <button onclick="insertHtml()">�������������</button>
        <button id="enable" onclick="setEnabled()">���Ա༭</button>
        <button onclick="setDisabled()">���ɱ༭</button>
        <button onclick=" UE.getEditor('editor').setHide()">���ر༭��</button>
        <button onclick=" UE.getEditor('editor').setShow()">��ʾ�༭��</button>
        <button onclick=" UE.getEditor('editor').setHeight(300)">���ø߶�Ϊ300Ĭ�Ϲر����Զ�����</button>
    </div>

    <div>
        <button onclick="getLocalData()" >��ȡ�ݸ�������</button>
        <button onclick="clearLocalData()" >��ղݸ���</button>
    </div>

</div>
<div>
    <button onclick="createEditor()">
    �����༭��</button>
    <button onclick="deleteEditor()">
    ɾ���༭��</button>
</div>
</form>
<script type="text/javascript">

    //ʵ�����༭��
    //����ʹ�ù�������getEditor���������ñ༭��ʵ���������ĳ���հ������øñ༭����ֱ�ӵ���UE.getEditor('editor')�����õ���ص�ʵ��
    var ue = UE.getEditor('editor');


    function isFocus(e){
        alert(UE.getEditor('editor').isFocus());
        UE.dom.domUtils.preventDefault(e)
    }
    function setblur(e){
        UE.getEditor('editor').blur();
        UE.dom.domUtils.preventDefault(e)
    }
    function insertHtml() {
        var value = prompt('����html����', '');
        UE.getEditor('editor').execCommand('insertHtml', value)
    }
    function createEditor() {
        enableBtn();
        UE.getEditor('editor');
    }
    function getAllHtml() {
        alert(UE.getEditor('editor').getAllHtml())
    }
    function getContent() {
        var arr = [];
        arr.push("ʹ��editor.getContent()�������Ի�ñ༭��������");
        arr.push("����Ϊ��");
        arr.push(UE.getEditor('editor').getContent());
        alert(arr.join("\n"));
    }
    function getPlainTxt() {
        var arr = [];
        arr.push("ʹ��editor.getPlainTxt()�������Ի�ñ༭���Ĵ���ʽ�Ĵ��ı�����");
        arr.push("����Ϊ��");
        arr.push(UE.getEditor('editor').getPlainTxt());
        alert(arr.join('\n'))
    }
    function setContent(isAppendTo) {
        var arr = [];
        arr.push("ʹ��editor.setContent('��ӭʹ��ueditor')�����������ñ༭��������");
        UE.getEditor('editor').setContent('��ӭʹ��ueditor', isAppendTo);
        alert(arr.join("\n"));
    }
    function setDisabled() {
        UE.getEditor('editor').setDisabled('fullscreen');
        disableBtn("enable");
    }

    function setEnabled() {
        UE.getEditor('editor').setEnabled();
        enableBtn();
    }

    function getText() {
        //��������ťʱ�༭�����Ѿ�ʧȥ�˽��㣬���ֱ����getText������õ����ݣ�����Ҫ��ѡ������Ȼ��ȡ������
        var range = UE.getEditor('editor').selection.getRange();
        range.select();
        var txt = UE.getEditor('editor').selection.getText();
        alert(txt)
    }

    function getContentTxt() {
        var arr = [];
        arr.push("ʹ��editor.getContentTxt()�������Ի�ñ༭���Ĵ��ı�����");
        arr.push("�༭���Ĵ��ı�����Ϊ��");
        arr.push(UE.getEditor('editor').getContentTxt());
        alert(arr.join("\n"));
    }
    function hasContent() {
        var arr = [];
        arr.push("ʹ��editor.hasContents()�����жϱ༭�����Ƿ�������");
        arr.push("�жϽ��Ϊ��");
        arr.push(UE.getEditor('editor').hasContents());
        alert(arr.join("\n"));
    }
    function setFocus() {
        UE.getEditor('editor').focus();
    }
    function deleteEditor() {
        disableBtn();
        UE.getEditor('editor').destroy();
    }
    function disableBtn(str) {
        var div = document.getElementById('btns');
        var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
        for (var i = 0, btn; btn = btns[i++];) {
            if (btn.id == str) {
                UE.dom.domUtils.removeAttributes(btn, ["disabled"]);
            } else {
                btn.setAttribute("disabled", "true");
            }
        }
    }
    function enableBtn() {
        var div = document.getElementById('btns');
        var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
        for (var i = 0, btn; btn = btns[i++];) {
            UE.dom.domUtils.removeAttributes(btn, ["disabled"]);
        }
    }

    function getLocalData () {
        alert(UE.getEditor('editor').execCommand( "getlocaldata" ));
    }

    function clearLocalData () {
        UE.getEditor('editor').execCommand( "clearlocaldata" );
        alert("����ղݸ���")
    }
</script>
</body>
</html>