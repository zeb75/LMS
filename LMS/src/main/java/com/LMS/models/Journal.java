package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class Journal extends Book {

	private int ID;
	private String pubDate;
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public int getID() {
		return ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ID;
		result = prime * result + ((pubDate == null) ? 0 : pubDate.hashCode());
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
		Journal other = (Journal) obj;
		if (ID != other.ID)
			return false;
		if (pubDate == null) {
			if (other.pubDate != null)
				return false;
		} else if (!pubDate.equals(other.pubDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Journal [ID=" + ID + ", pubDate=" + pubDate + "]";
	}
	
	
}
