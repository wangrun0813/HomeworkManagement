package com.model;

/**
 * Teach entity. @author MyEclipse Persistence Tools
 */

public class Teach implements java.io.Serializable {

	// Fields

	private TeachId id;

	// Constructors

	/** default constructor */
	public Teach() {
	}

	/** full constructor */
	public Teach(TeachId id) {
		this.id = id;
	}

	// Property accessors

	public TeachId getId() {
		return this.id;
	}

	public void setId(TeachId id) {
		this.id = id;
	}

}