package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.AdminDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTeacherInfoAction extends ActionSupport{
	

	private String tid;
//	private String tno;
//	private String tname;
//	private String tsex;
//	private String temail;
//	private String tphone;
	
	private HttpSession session;
	
	
	public  UpdateTeacherInfoAction() {
			session = ServletActionContext.getRequest().getSession();
	}
	

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	public String execute() {
		tid = ServletActionContext.getRequest().getParameter("tid");
		System.out.println(tid);
		session.setAttribute("tid",tid);
		return SUCCESS;
				
	}

}