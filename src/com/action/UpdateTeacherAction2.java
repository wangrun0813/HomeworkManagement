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

public class UpdateTeacherAction2 extends ActionSupport{
	private String uid;
	private HttpSession session;
	
	public  UpdateTeacherAction2() {
			session = ServletActionContext.getRequest().getSession();
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String execute() {
	
		AdminDao aDao=new AdminDao();
		uid = ServletActionContext.getRequest().getParameter("uid");	
		//班级
		List<Sclass> sclassinfo=(List<Sclass>)aDao.showSclass(uid);
		session.setAttribute("sclassinfo", sclassinfo);	
		//课程号
		List<Course> cidinfo=(List<Course>)aDao.showcid();
		session.setAttribute("cidinfo", cidinfo);
		//教工号
		List<Teacher> teainfo =(List<Teacher>)aDao.showtid(uid); 
		session.setAttribute("teainfo", teainfo);
		return SUCCESS;
	
	}

}
