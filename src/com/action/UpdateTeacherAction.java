package com.action;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

import com.dao.AdminDao;
import com.dao.TeacherDao;
import com.dao.UserDao;
import com.model.Course;
import com.model.Sclass;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTeacherAction extends ActionSupport{
	private String uid;
	private HttpSession session;
	
	public  UpdateTeacherAction() {
			session = ServletActionContext.getRequest().getSession();
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String execute() {
		TeacherDao tDao= new TeacherDao();
		AdminDao aDao=new AdminDao();
		uid = ServletActionContext.getRequest().getParameter("uid");
		List<Teacher> tinfo=(List<Teacher>)tDao.uploadTeacherInfo(uid);
		session.setAttribute("tinfo", tinfo);		
		return SUCCESS;
	}

}
