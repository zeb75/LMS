package com.LMS.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private int bookId;
	private LocalDate issueDate;	
	private int MaxNoOfDays;
	private int MaxNoOfBooks; 

	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private Bill bill;
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Fine> fines = new ArrayList<>();
	
	@OneToMany(mappedBy = "loan",cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Book> books = new ArrayList<>();
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name= "member_id")
	private Member members;


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public int getMaxNoOfDays() {
		return MaxNoOfDays;
	}

	public void setMaxNoOfDays(int maxNoOfDays) {
		MaxNoOfDays = maxNoOfDays;
	}

	public int getMaxNoOfBooks() {
		return MaxNoOfBooks;
	}

	public void setMaxNoOfBooks(int maxNoOfBooks) {
		MaxNoOfBooks = maxNoOfBooks;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public List<Fine> getFines() {
		return fines;
	}

	public void setFines(List<Fine> fines) {
		this.fines = fines;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + MaxNoOfBooks;
		result = prime * result + MaxNoOfDays;
		result = prime * result + ((bill == null) ? 0 : bill.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((fines == null) ? 0 : fines.hashCode());
		result = prime * result + ((issueDate == null) ? 0 : issueDate.hashCode());
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
		Loan other = (Loan) obj;
		if (ID != other.ID)
			return false;
		if (MaxNoOfBooks != other.MaxNoOfBooks)
			return false;
		if (MaxNoOfDays != other.MaxNoOfDays)
			return false;
		if (bill == null) {
			if (other.bill != null)
				return false;
		} else if (!bill.equals(other.bill))
			return false;
		if (bookId != other.bookId)
			return false;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (fines == null) {
			if (other.fines != null)
				return false;
		} else if (!fines.equals(other.fines))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Loan [ID=" + ID + ", bookId=" + bookId + ", issueDate=" + issueDate + ", MaxNoOfDays=" + MaxNoOfDays
				+ ", MaxNoOfBooks=" + MaxNoOfBooks + ", bill=" + bill + ", fines=" + fines + ", books=" + books + "]";
	}
	

}
