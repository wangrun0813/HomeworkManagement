package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.StudentDao;
import com.model.Homework;
import com.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class showAction extends ActionSupport {
	private String sclass;
	private String Cid;//课程号 
	private String tid;//教师号
	private String title;
	private HttpSession session;

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getCid() {
		return Cid;
	}

	public void setCid(String cid) {
		Cid = cid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public showAction() {
		session = ServletActionContext.getRequest().getSession();
	}
	public String execute(){
		StudentDao studaoStudent=new StudentDao();
		//学生选择查看下载一门课的作业
		Homework showhomework=(Homework)studaoStudent.showhomework(sclass, tid, Cid, title).get(0);
		session.setAttribute("showhomework", showhomework);
		return SUCCESS;
	}

}
