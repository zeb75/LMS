package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class TextBook extends GeneralBook{

	private int subjectCode;
	private String subjectName;
	private String syllabus;
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + subjectCode;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		result = prime * result + ((syllabus == null) ? 0 : syllabus.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextBook other = (TextBook) obj;
		if (subjectCode != other.subjectCode)
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		if (syllabus == null) {
			if (other.syllabus != null)
				return false;
		} else if (!syllabus.equals(other.syllabus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TextBook [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", syllabus=" + syllabus + "]";
	}
	
	
}
