package com.LMS.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID; 
	private String name;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinTable(name = "Publishers_books"
	, joinColumns = @JoinColumn(name = "publisher_id")
	, inverseJoinColumns = @JoinColumn(name = "book_id")
	)
	private List<Book> publishedBooks = new ArrayList<>();
	
	public void addBook(Book book) {
		if(!publishedBooks.contains(book)) {
			publishedBooks.add(book);
		}
	}
	
	public void removeBook(Book book) {
		if(publishedBooks.contains(book)) {
			publishedBooks.remove(book);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getPublishedBooks() {
		return publishedBooks;
	}

	public void setPublishedBooks(List<Book> publishedBooks) {
		this.publishedBooks = publishedBooks;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publishedBooks == null) ? 0 : publishedBooks.hashCode());
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
		Publisher other = (Publisher) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publishedBooks == null) {
			if (other.publishedBooks != null)
				return false;
		} else if (!publishedBooks.equals(other.publishedBooks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publisher [ID=" + ID + ", name=" + name + ", publishedBooks=" + publishedBooks + "]";
	}
	
	
}
