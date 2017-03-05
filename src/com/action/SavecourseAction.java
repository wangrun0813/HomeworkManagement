package com.action;

import org.apache.struts2.ServletActionContext;

import com.dao.AdminDao;
import com.model.Admin;
import com.model.Course;
import com.model.Sclass;
import com.model.Teach;
import com.model.TeachId;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

public class SavecourseAction extends ActionSupport{
	private String Cid;
	private String tid;
	private String sclass;
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
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String execute() {
		AdminDao adminDao =new AdminDao();
		Course course=new Course(Cid);
		Teacher teacher=new Teacher(tid);
		Sclass sclass1=new Sclass(sclass);
		System.out.println(course);
		System.out.println(teacher);
		System.out.println(sclass1);
        TeachId teachId=new TeachId(course, teacher, sclass1);
	    Teach teach =new Teach(teachId);
		adminDao.saveCourse(teach);
		return SUCCESS;
	}
	
}
