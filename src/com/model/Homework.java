package com.model;

import java.util.Date;

/**
 * Homework entity. @author MyEclipse Persistence Tools
 */

public class Homework implements java.io.Serializable {

	// Fields

	private HomeworkId id;
	private Date sdate;
	private Date tdate;
	private String uploadFileName;
	private String submit;
	private String editorValue;

	// Constructors

	/** default constructor */
	public Homework() {
	}

	/** minimal constructor */
	public Homework(HomeworkId id, String uploadFileName) {
		this.id = id;
		this.uploadFileName = uploadFileName;
	}
	
	public Homework(HomeworkId id, Date sdate, Date tdate,
			String uploadFileName, String editorValue) {
		this.id = id;
		this.sdate = sdate;
		this.tdate = tdate;
		this.uploadFileName = uploadFileName;
		this.editorValue = editorValue;
	}

	/** full constructor */
	public Homework(HomeworkId id, Date sdate, Date tdate,
			String uploadFileName, String submit, String editorValue) {
		this.id = id;
		this.sdate = sdate;
		this.tdate = tdate;
		this.uploadFileName = uploadFileName;
		this.submit = submit;
		this.editorValue = editorValue;
	}

	// Property accessors

	public HomeworkId getId() {
		return this.id;
	}

	public void setId(HomeworkId id) {
		this.id = id;
	}

	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getTdate() {
		return this.tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public String getUploadFileName() {
		return this.uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSubmit() {
		return this.submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getEditorValue() {
		return this.editorValue;
	}

	public void setEditorValue(String editorValue) {
		this.editorValue = editorValue;
	}

}