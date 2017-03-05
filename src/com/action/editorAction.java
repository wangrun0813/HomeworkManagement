package com.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.TeacherDao;
import com.model.Course;
import com.model.Homework;
import com.model.HomeworkId;
import com.model.Sclass;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

public class editorAction extends ActionSupport {
	private static final int BUFFER_SIZE=16*1024;
	private String Cid;//课程号
	private String sclass;//班级
	private Timestamp  sdate;
	private Timestamp tdate;
	private String title;//文件标题
	private File upload;//上传文件域对象
	 private String uploadFileName;//文件上传名
    private String uploadContextType;//文件上传类型
    private String savePath;//保存文件的目录路径（通过依赖注入）
    private HttpSession session;
    //用来接受富文本传过来的内容！
    private String editorValue;
	public String getEditorValue() {
		return editorValue;
	}
	public void setEditorValue(String editorValue) {
		this.editorValue = editorValue;
	}
	public editorAction() {
		session = ServletActionContext.getRequest().getSession();
	}
	public String getCid() {
		return Cid;
	}

	public void setCid(String cid) {
		Cid = cid;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public Timestamp getSdate() {
		return sdate;
	}

	public void setSdate(Timestamp sdate) {
		this.sdate = sdate;
	}

	public Timestamp getTdate() {
		return tdate;
	}

	public void setTdate(Timestamp tdate) {
		this.tdate = tdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContextType() {
		return uploadContextType;
	}

	public void setUploadContextType(String uploadContextType) {
		this.uploadContextType = uploadContextType;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public static int getBufferSize() {
		return BUFFER_SIZE;
	}
	private static void copy(File src,File dst){
    	InputStream in=null;
    	OutputStream out=null;
    	try {
			in=new BufferedInputStream(new FileInputStream(src),BUFFER_SIZE);
			out=new BufferedOutputStream(new FileOutputStream(dst),BUFFER_SIZE);
			byte[] buffer=new byte[BUFFER_SIZE];
			int len=0;
			while((len=in.read(buffer))>0){
				out.write(buffer, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
  
	
	
	@Override
	public String execute() throws Exception {
		//根据服务器的文件保存地址和原文件名 创建目录文件全路径
    	String dstPath="C:\\Users\\Administrator\\Workspaces\\MyEclipse 10\\homework\\"+this.getUploadFileName(); 
    	File dstFile=new  File(dstPath);
    	copy(this.upload,dstFile);
    	System.out.println("editorValue"+editorValue);
    	//作业信息上传到数据库
    	Teacher teacher=(Teacher)session.getAttribute("teacher");
    	String tid=teacher.getTid();	
    	sclass=getSclass();
    	Cid=getCid();
    	sdate=getSdate();
    	tdate=getTdate();
    	title=getTitle();
     	uploadFileName=getUploadFileName();

    	Sclass sclass1=new Sclass(sclass);
    	Course course=new Course(Cid);
    	Teacher tea=new Teacher(tid);
    	HomeworkId id = new HomeworkId(tea, sclass1, course, title);
    	TeacherDao teadao=new TeacherDao();
    	Homework homework= new Homework(id,sdate,tdate,uploadFileName,editorValue);
    	teadao.saveHomework(homework);
		System.out.println("editorValue:"+editorValue);
		return SUCCESS;
	}
}
