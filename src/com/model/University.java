package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * University entity. @author MyEclipse Persistence Tools
 */

public class University implements java.io.Serializable {

	// Fields

	private String uid;
	private String uname;
	private String uemail;
	private Set sclasses = new HashSet(0);
	private Set admins = new HashSet(0);
	private Set teachers = new HashSet(0);

	// Constructors

	/** default constructor */
	public University() {
	}
	public University(String uid) {
		this.uid = uid;
	}
	
	public University(String uid, String uname, String uemail) {
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
	}


	/** minimal constructor */
	public University(String uid, String uname) {
		this.uid = uid;
		this.uname = uname;
	}

	/** full constructor */
	public University(String uid, String uname, String uemail, Set sclasses,
			Set admins, Set teachers) {
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.sclasses = sclasses;
		this.admins = admins;
		this.teachers = teachers;
	}

	// Property accessors

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public Set getSclasses() {
		return this.sclasses;
	}

	public void setSclasses(Set sclasses) {
		this.sclasses = sclasses;
	}

	public Set getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set admins) {
		this.admins = admins;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

}