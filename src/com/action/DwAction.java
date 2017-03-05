package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.StudentDao;
import com.model.Homework;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DwAction extends ActionSupport{
	private String sclass;
	private String Cid;//课程号 
	private String tid;//教师号
	private HttpSession session;
	
	public DwAction() {
			session = ServletActionContext.getRequest().getSession();
	}
	
	
	public String execute(){
		sclass = ServletActionContext.getRequest().getParameter("sclass");
		Cid = ServletActionContext.getRequest().getParameter("cid");
		tid = ServletActionContext.getRequest().getParameter("tid");
		System.out.println(sclass);
		System.out.println(Cid);
		System.out.println(tid);
		StudentDao studaoStudent=new StudentDao();
		//学生选择查看下载一门课的作业
		List<Homework> homeworks=(List<Homework>)studaoStudent.downloadHomework2(sclass, tid, Cid);
		session.setAttribute("homeworks", homeworks);		
		return SUCCESS;
		
	}

}
