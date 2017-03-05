package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.AdminDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteTeacherAction extends ActionSupport{
	private String tid;
	private HttpSession session;
	
	public  DeleteTeacherAction() {
			session = ServletActionContext.getRequest().getSession();
	}
	

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	public String execute() {
		AdminDao aDao=new AdminDao();
		aDao.delPassword(tid);
		return SUCCESS;
				
	}

}
