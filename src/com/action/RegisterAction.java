package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.StudentDao;
import com.dao.UserDao;
import com.model.Password;
import com.model.Student;
import com.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport  {
	private String sid;
	private String sname;
	private String sno;
	private String spswd;
	private String ssex;
	private String school;
	private String sclass;
	private String semail;
	private String uname;
	private HttpSession session;

	public RegisterAction() {
		session = ServletActionContext.getRequest().getSession();
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSpswd() {
		return spswd;
	}

	public void setSpswd(String spswd) {
		this.spswd = spswd;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
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

	public String execute(){

		// 实例化Userdao
	    UserDao dao = new UserDao();
	    StudentDao studao=new StudentDao();
	    Student student = new Student(sid, sno, sname, ssex, sclass,uname);
	    String id=getSid();
	    String pswd=getSpswd();
	    Password ps = new Password(id, pswd);
	    studao.saveStudent(student);
	    dao.savepswd(ps);
	    
		return SUCCESS;
	}
}
