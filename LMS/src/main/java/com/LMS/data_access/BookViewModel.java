package com.LMS.data_access;

public class BookViewModel {

	private int categoryID;
	private int authorID;
	private int publisherID;
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
		result = prime * result + authorID;
		result = prime * result + categoryID;
		result = prime * result + publisherID;
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
		if (authorID != other.authorID)
			return false;
		if (categoryID != other.categoryID)
			return false;
		if (publisherID != other.publisherID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookViewModel [categoryID=" + categoryID + ", authorID=" + authorID + ", publisherID=" + publisherID
				+ "]";
	}
	
	
}
