package com.action;

import com.dao.AdminDao;
import com.dao.StudentDao;
import com.dao.UserDao;
import com.model.Password;
import com.model.Student;
import com.model.Teacher;
import com.model.University;
import com.opensymphony.xwork2.ActionSupport;

public class AddStudentAction extends ActionSupport{
	private String sid;
	private String sno;
	private String sname;
	private String ssex;
	private String sclass;
	private String semail;
	private String uname;
	private String pswd;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	
	public String execute() {
		StudentDao stu1=new StudentDao();
		UserDao userDao=new UserDao();
		Student student=new Student(sid, sno, sname, ssex, semail, sclass, uname);
		String id=getSid();
		Password ps=new Password(id, pswd);
		stu1.saveStudent(student);  
		 userDao.savepswd(ps);
		return SUCCESS;
	}

}
