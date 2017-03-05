package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class ChooseCourse extends ActionSupport{
	private String cid;
	private String tid;
	private String sclass;

	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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
		
		return SUCCESS;
	}
	

}
