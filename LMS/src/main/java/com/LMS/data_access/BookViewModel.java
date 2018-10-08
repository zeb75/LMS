package com.LMS.data_access;

import java.time.LocalDate;

public class BookViewModel {

	private int ID;
	private String title;
	private String ISBNNo;
	private String shelf;
	private String status;
	private String edition;
	private LocalDate dateOfPurchase;
	private boolean RefBook;
	private String description;
	private int categoryID;
	private int authorID;
	private int publisherID;
	
	public int getID() {
		return ID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBNNo() {
		return ISBNNo;
	}
	public void setISBNNo(String iSBNNo) {
		ISBNNo = iSBNNo;
	}
	public String getShelf() {
		return shelf;
	}
	public void setShelf(String shelf) {
		this.shelf = shelf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public boolean isRefBook() {
		return RefBook;
	}
	public void setRefBook(boolean refBook) {
		RefBook = refBook;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public int getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((ISBNNo == null) ? 0 : ISBNNo.hashCode());
		result = prime * result + (RefBook ? 1231 : 1237);
		result = prime * result + authorID;
		result = prime * result + categoryID;
		result = prime * result + ((dateOfPurchase == null) ? 0 : dateOfPurchase.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((edition == null) ? 0 : edition.hashCode());
		result = prime * result + publisherID;
		result = prime * result + ((shelf == null) ? 0 : shelf.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		BookViewModel other = (BookViewModel) obj;
		if (ID != other.ID)
			return false;
		if (ISBNNo == null) {
			if (other.ISBNNo != null)
				return false;
		} else if (!ISBNNo.equals(other.ISBNNo))
			return false;
		if (RefBook != other.RefBook)
			return false;
		if (authorID != other.authorID)
			return false;
		if (categoryID != other.categoryID)
			return false;
		if (dateOfPurchase == null) {
			if (other.dateOfPurchase != null)
				return false;
		} else if (!dateOfPurchase.equals(other.dateOfPurchase))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (edition == null) {
			if (other.edition != null)
				return false;
		} else if (!edition.equals(other.edition))
			return false;
		if (publisherID != other.publisherID)
			return false;
		if (shelf == null) {
			if (other.shelf != null)
				return false;
		} else if (!shelf.equals(other.shelf))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookViewModel [ID=" + ID + ", title=" + title + ", ISBNNo=" + ISBNNo + ", shelf=" + shelf + ", status="
				+ status + ", edition=" + edition + ", dateOfPurchase=" + dateOfPurchase + ", RefBook=" + RefBook
				+ ", description=" + description + ", categoryID=" + categoryID + ", authorID=" + authorID
				+ ", publisherID=" + publisherID + "]";
	}
	

}
