package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private String tid;
	private University university;
	private String tno;
	private String tname;
	private String tsex;
	private String tphto;
	private String temail;
	private String tphone;
	private Set teachs = new HashSet(0);
	private Set homeworks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}
	
	public Teacher(String tid) {
		this.tid = tid;
	}

	/** minimal constructor */
	public Teacher(String tid, String tno, String tname, String tsex) {
		this.tid = tid;
		this.tno = tno;
		this.tname = tname;
		this.tsex = tsex;
	}
	
	public Teacher(String tid,  String tno, String tname,
			String tsex, University university, String temail, String tphone) {
		this.tid = tid;
		this.university = university;
		this.tno = tno;
		this.tname = tname;
		this.tsex = tsex;
		this.temail = temail;
		this.tphone = tphone;
	}

	/** full constructor */
	public Teacher(String tid, University university, String tno, String tname,
			String tsex, String tphto, String temail, String tphone,
			Set teachs, Set homeworks) {
		this.tid = tid;
		this.university = university;
		this.tno = tno;
		this.tname = tname;
		this.tsex = tsex;
		this.tphto = tphto;
		this.temail = temail;
		this.tphone = tphone;
		this.teachs = teachs;
		this.homeworks = homeworks;
	}

	// Property accessors

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getTno() {
		return this.tno;
	}

	public void setTno(String tno) {
		this.tno = tno;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsex() {
		return this.tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public String getTphto() {
		return this.tphto;
	}

	public void setTphto(String tphto) {
		this.tphto = tphto;
	}

	public String getTemail() {
		return this.temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTphone() {
		return this.tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public Set getTeachs() {
		return this.teachs;
	}

	public void setTeachs(Set teachs) {
		this.teachs = teachs;
	}

	public Set getHomeworks() {
		return this.homeworks;
	}

	public void setHomeworks(Set homeworks) {
		this.homeworks = homeworks;
	}

}