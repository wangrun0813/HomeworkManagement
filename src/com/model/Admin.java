package com.model;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private String aid;
	private University university;
	private String aname;
	private String asex;
	private String atel;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String aid, String aname) {
		this.aid = aid;
		this.aname = aname;
	}

	/** full constructor */
	public Admin(String aid, University university, String aname, String asex,
			String atel) {
		this.aid = aid;
		this.university = university;
		this.aname = aname;
		this.asex = asex;
		this.atel = atel;
	}

	// Property accessors

	public String getAid() {
		return this.aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAsex() {
		return this.asex;
	}

	public void setAsex(String asex) {
		this.asex = asex;
	}

	public String getAtel() {
		return this.atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

}