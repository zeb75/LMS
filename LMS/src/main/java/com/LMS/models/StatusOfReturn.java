package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class StatusOfReturn {

	private int memberId;
	private String bookTitle;
	private int catNo;
	private String issueDate;
	private String expiryDate;
	private double fineAmount;
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
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getFineAmount() {
		return fineAmount;
	}
	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
	public int getMemberId() {
		return memberId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + catNo;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fineAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		StatusOfReturn other = (StatusOfReturn) obj;
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
		if (Double.doubleToLongBits(fineAmount) != Double.doubleToLongBits(other.fineAmount))
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
		return "StatusOfReturn [memberId=" + memberId + ", bookTitle=" + bookTitle + ", catNo=" + catNo + ", issueDate="
				+ issueDate + ", expiryDate=" + expiryDate + ", fineAmount=" + fineAmount + "]";
	}
	
	
}
