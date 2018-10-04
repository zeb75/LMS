package com.LMS.models;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String title;
	private String ISBNNo;
	private String shelf;
	private String status;
	private String edition;
	private LocalDate dateOfPurchase;
	private boolean RefBook;
	private String description;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name="loan_id")
	private Loan loan;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	@JoinColumn(name="category_id")
	private Category category;

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

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((ISBNNo == null) ? 0 : ISBNNo.hashCode());
		result = prime * result + (RefBook ? 1231 : 1237);
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((dateOfPurchase == null) ? 0 : dateOfPurchase.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((edition == null) ? 0 : edition.hashCode());
		result = prime * result + ((loan == null) ? 0 : loan.hashCode());
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
		Book other = (Book) obj;
		if (ID != other.ID)
			return false;
		if (ISBNNo == null) {
			if (other.ISBNNo != null)
				return false;
		} else if (!ISBNNo.equals(other.ISBNNo))
			return false;
		if (RefBook != other.RefBook)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
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
		if (loan == null) {
			if (other.loan != null)
				return false;
		} else if (!loan.equals(other.loan))
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
		return "Book [ID=" + ID + ", title=" + title + ", ISBNNo=" + ISBNNo + ", shelf=" + shelf + ", status=" + status
				+ ", edition=" + edition + ", dateOfPurchase=" + dateOfPurchase + ", RefBook=" + RefBook
				+ ", description=" + description + ", loan=" + loan + ", category=" + category + "]";
	}

	
}
