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

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private int bookId;
	private LocalDate issueDate;	
	private int maxNoOfDays;
	private int maxNoOfBooks; 

	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Fine> fines = new ArrayList<>();
	
	@OneToMany(mappedBy = "loan",cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Book> borrowedBooks = new ArrayList<>();
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
		book.setLoan(this);
		}
	
	public void returnBook (Book book) {
		book.setLoan(null);
		borrowedBooks.remove(book);
	}
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name= "member_id")
	private Member member;

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
		return maxNoOfDays;
	}

	public void setMaxNoOfDays(int maxNoOfDays) {
		this.maxNoOfDays = maxNoOfDays;
	}

	public int getMaxNoOfBooks() {
		return maxNoOfBooks;
	}

	public void setMaxNoOfBooks(int maxNoOfBooks) {
		this.maxNoOfBooks = maxNoOfBooks;
	}

	public List<Fine> getFines() {
		return fines;
	}

	public void setFines(List<Fine> fines) {
		this.fines = fines;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + bookId;
		result = prime * result + ((borrowedBooks == null) ? 0 : borrowedBooks.hashCode());
		result = prime * result + ((fines == null) ? 0 : fines.hashCode());
		result = prime * result + ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result + maxNoOfBooks;
		result = prime * result + maxNoOfDays;
		result = prime * result + ((member == null) ? 0 : member.hashCode());
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
		if (bookId != other.bookId)
			return false;
		if (borrowedBooks == null) {
			if (other.borrowedBooks != null)
				return false;
		} else if (!borrowedBooks.equals(other.borrowedBooks))
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
		if (maxNoOfBooks != other.maxNoOfBooks)
			return false;
		if (maxNoOfDays != other.maxNoOfDays)
			return false;
		if (member == null) {
			if (other.member != null)
				return false;
		} else if (!member.equals(other.member))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Loan [ID=" + ID + ", bookId=" + bookId + ", issueDate=" + issueDate + ", maxNoOfDays=" + maxNoOfDays
				+ ", maxNoOfBooks=" + maxNoOfBooks + ", fines=" + fines + ", borrowedBooks=" + borrowedBooks
				+ ", member=" + member + "]";
	}


}