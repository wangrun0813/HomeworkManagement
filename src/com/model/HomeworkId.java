package com.model;

/**
 * HomeworkId entity. @author MyEclipse Persistence Tools
 */

public class HomeworkId implements java.io.Serializable {

	// Fields

	private Teacher teacher;
	private Sclass sclass;
	private Course course;
	private String title;

	// Constructors

	/** default constructor */
	public HomeworkId() {
	}

	/** full constructor */
	public HomeworkId(Teacher teacher, Sclass sclass, Course course,
			String title) {
		this.teacher = teacher;
		this.sclass = sclass;
		this.course = course;
		this.title = title;
	}

	// Property accessors

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Sclass getSclass() {
		return this.sclass;
	}

	public void setSclass(Sclass sclass) {
		this.sclass = sclass;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HomeworkId))
			return false;
		HomeworkId castOther = (HomeworkId) other;

		return ((this.getTeacher() == castOther.getTeacher()) || (this
				.getTeacher() != null && castOther.getTeacher() != null && this
				.getTeacher().equals(castOther.getTeacher())))
				&& ((this.getSclass() == castOther.getSclass()) || (this
						.getSclass() != null && castOther.getSclass() != null && this
						.getSclass().equals(castOther.getSclass())))
				&& ((this.getCourse() == castOther.getCourse()) || (this
						.getCourse() != null && castOther.getCourse() != null && this
						.getCourse().equals(castOther.getCourse())))
				&& ((this.getTitle() == castOther.getTitle()) || (this
						.getTitle() != null && castOther.getTitle() != null && this
						.getTitle().equals(castOther.getTitle())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		result = 37 * result
				+ (getSclass() == null ? 0 : this.getSclass().hashCode());
		result = 37 * result
				+ (getCourse() == null ? 0 : this.getCourse().hashCode());
		result = 37 * result
				+ (getTitle() == null ? 0 : this.getTitle().hashCode());
		return result;
	}

}