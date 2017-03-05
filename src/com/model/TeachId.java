package com.model;

/**
 * TeachId entity. @author MyEclipse Persistence Tools
 */

public class TeachId implements java.io.Serializable {

	// Fields

	private Course course;
	private Teacher teacher;
	private Sclass sclass;

	// Constructors

	/** default constructor */
	public TeachId() {
	}

	/** full constructor */
	public TeachId(Course course, Teacher teacher, Sclass sclass) {
		this.course = course;
		this.teacher = teacher;
		this.sclass = sclass;
	}

	// Property accessors

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeachId))
			return false;
		TeachId castOther = (TeachId) other;

		return ((this.getCourse() == castOther.getCourse()) || (this
				.getCourse() != null && castOther.getCourse() != null && this
				.getCourse().equals(castOther.getCourse())))
				&& ((this.getTeacher() == castOther.getTeacher()) || (this
						.getTeacher() != null && castOther.getTeacher() != null && this
						.getTeacher().equals(castOther.getTeacher())))
				&& ((this.getSclass() == castOther.getSclass()) || (this
						.getSclass() != null && castOther.getSclass() != null && this
						.getSclass().equals(castOther.getSclass())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCourse() == null ? 0 : this.getCourse().hashCode());
		result = 37 * result
				+ (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		result = 37 * result
				+ (getSclass() == null ? 0 : this.getSclass().hashCode());
		return result;
	}

}