package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Sclass entity. @author MyEclipse Persistence Tools
 */

public class Sclass implements java.io.Serializable {

	// Fields

	private String sclass;
	private University university;
	private Set teachs = new HashSet(0);
	private Set homeworks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sclass() {
	}

	/** minimal constructor */
	public Sclass(String sclass) {
		this.sclass = sclass;
	}

	/** full constructor */
	public Sclass(String sclass, University university, Set teachs,
			Set homeworks) {
		this.sclass = sclass;
		this.university = university;
		this.teachs = teachs;
		this.homeworks = homeworks;
	}

	// Property accessors

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
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