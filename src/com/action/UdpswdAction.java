package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.dao.UserDao;
import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;


public class UdpswdAction extends ActionSupport{
	private static String forword = null;
	private String pswd;
	private HttpSession session;
	
	public UdpswdAction() {
		session = ServletActionContext.getRequest().getSession();
	}

	public String getPswd(){
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String execute(){
		pswd = getPswd();
		Student student = (Student)session.getAttribute("student");	
		String id1=student.getSid();
		 UserDao dao = new UserDao();
		// 实例化Userdao
	    dao.upPassword(id1, pswd);       
		forword = "success";	   
		return forword;
	}
	public HttpSession getSession() {
		return session;
	}
}
