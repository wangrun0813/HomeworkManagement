package com.action;

import com.dao.AdminDao;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
public class UpdateTeacherInfoAction2 extends ActionSupport{
	private String temail;
	private String tphone;
	private HttpSession session;
	
	public UpdateTeacherInfoAction2() {
		session = ServletActionContext.getRequest().getSession();
	}

	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	
	public String execute() {
		String tid=(String)session.getAttribute("tid");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(tid);
		AdminDao adminDao=new AdminDao();
		adminDao.upTeacher(tid, temail, tphone);
		System.out.println(temail);
		System.out.println(tphone);
		return SUCCESS;
	}

}
