package com.model;

/**
 * Chose entity. @author MyEclipse Persistence Tools
 */

public class Chose implements java.io.Serializable {

	// Fields

	private ChoseId id;

	// Constructors

	/** default constructor */
	public Chose() {
	}

	/** full constructor */
	public Chose(ChoseId id) {
		this.id = id;
	}

	// Property accessors

	public ChoseId getId() {
		return this.id;
	}

	public void setId(ChoseId id) {
		this.id = id;
	}

}