package com.LMS.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatusOfIssue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private int memberId;
	private String bookTitle;
	private int catNo;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private int attemptsLeft;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getCatNo() {
		return catNo;
	}
	public void setCatNo(int catNo) {
		this.catNo = catNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getAttemptsLeft() {
		return attemptsLeft;
	}
	public void setAttemptsLeft(int attemptsLeft) {
		this.attemptsLeft = attemptsLeft;
	}
	public int getID() {
		return ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + attemptsLeft;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + catNo;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result + memberId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusOfIssue other = (StatusOfIssue) obj;
		if (ID != other.ID)
			return false;
		if (attemptsLeft != other.attemptsLeft)
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (catNo != other.catNo)
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (memberId != other.memberId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StatusOfIssue [ID=" + ID + ", memberId=" + memberId + ", bookTitle=" + bookTitle + ", catNo=" + catNo
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", attemptsLeft=" + attemptsLeft + "]";
	}
	
	
	
}
