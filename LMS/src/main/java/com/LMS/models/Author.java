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
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String name;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinTable(name = "authors_books"
	, joinColumns = @JoinColumn(name = "author_id")
	, inverseJoinColumns = @JoinColumn(name = "book_id")
	)
	private List<Book> authoredBooks = new ArrayList<>();
	
	public void addBook(Book book) {
		if(!authoredBooks.contains(book)) {
			authoredBooks.add(book);
		}
	}
	
	public void removeBook(Book book) {
		if(authoredBooks.contains(book)) {
			authoredBooks.remove(book);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getAuthoredBooks() {
		return authoredBooks;
	}

	public void setAuthoredBooks(List<Book> authoredBooks) {
		this.authoredBooks = authoredBooks;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((authoredBooks == null) ? 0 : authoredBooks.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Author other = (Author) obj;
		if (ID != other.ID)
			return false;
		if (authoredBooks == null) {
			if (other.authoredBooks != null)
				return false;
		} else if (!authoredBooks.equals(other.authoredBooks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [ID=" + ID + ", name=" + name + ", authoredBooks=" + authoredBooks + "]";
	}
	
	

}
