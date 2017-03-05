package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private String cid;
	private String cname;
	private Set teachs = new HashSet(0);
	private Set choses = new HashSet(0);
	private Set homeworks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}
	public Course(String cid) {
		this.cid = cid;
	}


	/** minimal constructor */
	public Course(String cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	
//	public Course(String cid, String cname, Set teachs) {
//		this.cid = cid;
//		this.cname = cname;
//		this.teachs = teachs;
//		this.choses = choses;
//		this.homeworks = homeworks;
//	}

	/** full constructor */
	public Course(String cid, String cname, Set teachs, Set choses,
			Set homeworks) {
		this.cid = cid;
		this.cname = cname;
		this.teachs = teachs;
		this.choses = choses;
		this.homeworks = homeworks;
	}

	// Property accessors

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getTeachs() {
		return this.teachs;
	}

	public void setTeachs(Set teachs) {
		this.teachs = teachs;
	}

	public Set getChoses() {
		return this.choses;
	}

	public void setChoses(Set choses) {
		this.choses = choses;
	}

	public Set getHomeworks() {
		return this.homeworks;
	}

	public void setHomeworks(Set homeworks) {
		this.homeworks = homeworks;
	}

}