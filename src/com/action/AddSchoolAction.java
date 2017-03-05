package com.action;

import com.dao.AdminDao;
import com.model.University;
import com.opensymphony.xwork2.ActionSupport;

public class AddSchoolAction extends ActionSupport{
	private static String forword = null;
	private String uid;
	private String uname;
	private String uemail;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	public String execute() {
		AdminDao ad=new AdminDao();
		if(ad.findSchoolByid(uid)){
			forword="input";
		}
		else{
		University un=new University(uid, uname, uemail);
		ad.saveUniversity(un);
		forword="success";
		}
		return forword;
	}

}
