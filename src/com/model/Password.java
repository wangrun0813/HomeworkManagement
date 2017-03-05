package com.model;

/**
 * Password entity. @author MyEclipse Persistence Tools
 */

public class Password implements java.io.Serializable {

	// Fields

	private String id;
	private String pswd;

	// Constructors

	/** default constructor */
	public Password() {
	}

	/** full constructor */
	public Password(String id, String pswd) {
		this.id = id;
		this.pswd = pswd;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPswd() {
		return this.pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

}