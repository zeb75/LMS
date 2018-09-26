package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class Book {

	private String ISBNNo;
	private String author;
	private String name;
	private int rackNo;
	private String status;
	private int edition;
	private String dateOfPurchase;
	private int noOfBooks;
	public String getISBNNo() {
		return ISBNNo;
	}
	public void setISBNNo(String iSBNNo) {
		ISBNNo = iSBNNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRackNo() {
		return rackNo;
	}
	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBNNo == null) ? 0 : ISBNNo.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((dateOfPurchase == null) ? 0 : dateOfPurchase.hashCode());
		result = prime * result + edition;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfBooks;
		result = prime * result + rackNo;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Book other = (Book) obj;
		if (ISBNNo == null) {
			if (other.ISBNNo != null)
				return false;
		} else if (!ISBNNo.equals(other.ISBNNo))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (dateOfPurchase == null) {
			if (other.dateOfPurchase != null)
				return false;
		} else if (!dateOfPurchase.equals(other.dateOfPurchase))
			return false;
		if (edition != other.edition)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfBooks != other.noOfBooks)
			return false;
		if (rackNo != other.rackNo)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [ISBNNo=" + ISBNNo + ", author=" + author + ", name=" + name + ", rackNo=" + rackNo + ", status="
				+ status + ", edition=" + edition + ", dateOfPurchase=" + dateOfPurchase + ", noOfBooks=" + noOfBooks
				+ "]";
	}
	
	
}
