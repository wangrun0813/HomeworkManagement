package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.UserDao;
import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

public class UdpswdTeaAction extends ActionSupport{
	private static String forword = null;
	private String pswd;
	private HttpSession session;
	
	public UdpswdTeaAction() {
		session = ServletActionContext.getRequest().getSession();
	}

	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	public String execute(){
		pswd = getPswd();

        Teacher teacher=(Teacher)session.getAttribute("teacher");
		String id2=teacher.getTid();	
		 UserDao dao = new UserDao();
	     dao.upPassword(id2, pswd);       
	     forword = "success";

	   
		return forword;
	}
	public HttpSession getSession() {
		return session;
	}
}


