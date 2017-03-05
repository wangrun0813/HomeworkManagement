package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String sid;
	private String sno;
	private String sname;
	private String ssex;
	private String sclass;
	private String sphto;
	private String semail;
	private String uname;
	private Set parents = new HashSet(0);
	private Set choses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sid, String sno, String sname, String ssex,
			String sclass, String uname) {
		this.sid = sid;
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sclass = sclass;
		this.uname = uname;
	}

	public Student(String sid, String sno, String sname, String ssex,
		 String semail, String sclass,String uname) {
		this.sid = sid;
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.semail = semail;
		this.sclass = sclass;
		this.uname = uname;
	}
	/** full constructor */
	public Student(String sid, String sno, String sname, String ssex,
			String sclass, String sphto, String semail, String uname,
			Set parents, Set choses) {
		this.sid = sid;
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sclass = sclass;
		this.sphto = sphto;
		this.semail = semail;
		this.uname = uname;
		this.parents = parents;
		this.choses = choses;
	}

	// Property accessors

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getSphto() {
		return this.sphto;
	}

	public void setSphto(String sphto) {
		this.sphto = sphto;
	}

	public String getSemail() {
		return this.semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set getParents() {
		return this.parents;
	}

	public void setParents(Set parents) {
		this.parents = parents;
	}

	public Set getChoses() {
		return this.choses;
	}

	public void setChoses(Set choses) {
		this.choses = choses;
	}

}