package com.action;

import com.dao.AdminDao;
import com.dao.UserDao;
import com.model.Password;
import com.model.Teacher;
import com.model.University;
import com.opensymphony.xwork2.ActionSupport;

public class AddTeacherAction  extends ActionSupport{
	private String tid;
	private String tno;
	private String tname;
	private String tsex;
	private String uid;
	private String temail;
	private String tphone;
	private String pswd;
	
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
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String execute() {
		AdminDao ad=new AdminDao();
		UserDao userDao=new UserDao();
		University university=new University(uid);
		Teacher teacher=new Teacher(tid, tno, tname, tsex, university, temail, tphone);
		String id=getTid();
		Password ps=new Password(id, pswd);
		 ad.saveTeacher(teacher);  
		 userDao.savepswd(ps);
		return SUCCESS;
	}

}
