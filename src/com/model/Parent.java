package com.model;

/**
 * Parent entity. @author MyEclipse Persistence Tools
 */

public class Parent implements java.io.Serializable {

	// Fields

	private String pid;
	private Student student;
	private String ptel;
	private String pemail;

	// Constructors

	/** default constructor */
	public Parent() {
	}

	/** minimal constructor */
	public Parent(String pid, Student student) {
		this.pid = pid;
		this.student = student;
	}

	/** full constructor */
	public Parent(String pid, Student student, String ptel, String pemail) {
		this.pid = pid;
		this.student = student;
		this.ptel = ptel;
		this.pemail = pemail;
	}

	// Property accessors

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPtel() {
		return this.ptel;
	}

	public void setPtel(String ptel) {
		this.ptel = ptel;
	}

	public String getPemail() {
		return this.pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

}