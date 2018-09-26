package com.LMS.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String name;
	private String address;
	private String phoneNo;
	private LocalDate registrationDate;
	private int noOfBooksIssued;
	private int maxBooksLimit;

	@OneToMany(mappedBy = "ID", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Loan> loans = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Fine> fines = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfIssue> statusOfIssues = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfReturn> statusOfReturns = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getNoOfBooksIssued() {
		return noOfBooksIssued;
	}

	public void setNoOfBooksIssued(int noOfBooksIssued) {
		this.noOfBooksIssued = noOfBooksIssued;
	}

	public int getMaxBooksLimit() {
		return maxBooksLimit;
	}

	public void setMaxBooksLimit(int maxBooksLimit) {
		this.maxBooksLimit = maxBooksLimit;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public List<Fine> getFines() {
		return fines;
	}

	public void setFines(List<Fine> fines) {
		this.fines = fines;
	}

	public List<StatusOfIssue> getStatusOfIssues() {
		return statusOfIssues;
	}

	public void setStatusOfIssues(List<StatusOfIssue> statusOfIssues) {
		this.statusOfIssues = statusOfIssues;
	}

	public List<StatusOfReturn> getStatusOfReturns() {
		return statusOfReturns;
	}

	public void setStatusOfReturns(List<StatusOfReturn> statusOfReturns) {
		this.statusOfReturns = statusOfReturns;
	}

	public int getID() {
		return ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((fines == null) ? 0 : fines.hashCode());
		result = prime * result + ((loans == null) ? 0 : loans.hashCode());
		result = prime * result + maxBooksLimit;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfBooksIssued;
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + ((statusOfIssues == null) ? 0 : statusOfIssues.hashCode());
		result = prime * result + ((statusOfReturns == null) ? 0 : statusOfReturns.hashCode());
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
		Member other = (Member) obj;
		if (ID != other.ID)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (fines == null) {
			if (other.fines != null)
				return false;
		} else if (!fines.equals(other.fines))
			return false;
		if (loans == null) {
			if (other.loans != null)
				return false;
		} else if (!loans.equals(other.loans))
			return false;
		if (maxBooksLimit != other.maxBooksLimit)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfBooksIssued != other.noOfBooksIssued)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		if (statusOfIssues == null) {
			if (other.statusOfIssues != null)
				return false;
		} else if (!statusOfIssues.equals(other.statusOfIssues))
			return false;
		if (statusOfReturns == null) {
			if (other.statusOfReturns != null)
				return false;
		} else if (!statusOfReturns.equals(other.statusOfReturns))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [ID=" + ID + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", registrationDate=" + registrationDate + ", noOfBooksIssued=" + noOfBooksIssued + ", maxBooksLimit="
				+ maxBooksLimit + ", loans=" + loans + ", fines=" + fines + ", statusOfIssues=" + statusOfIssues
				+ ", statusOfReturns=" + statusOfReturns + "]";
	}

	
	
}
