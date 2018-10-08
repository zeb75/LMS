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
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String zipCode;
	private String city;
	private String phoneNo;
	private LocalDate registrationDate;
	private int maxBooksLimit = 20;

	@OneToMany(mappedBy = "ID", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Loan> memberLoans = new ArrayList<>();
	
	public void startLoan(Loan loan) {
		memberLoans.add(loan);
		loan.setMember(this);
		}
	
	public void endLoan(Loan loan) {
		loan.setMember(null);
		memberLoans.remove(loan);
		}
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Fine> fines = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfIssue> statusOfIssues = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfReturn> statusOfReturns = new ArrayList<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public int getMaxBooksLimit() {
		return maxBooksLimit;
	}

	public void setMaxBooksLimit(int maxBooksLimit) {
		this.maxBooksLimit = maxBooksLimit;
	}

	public List<Loan> getMemberLoans() {
		return memberLoans;
	}

	public void setMemberLoans(List<Loan> memberLoans) {
		this.memberLoans = memberLoans;
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
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fines == null) ? 0 : fines.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + maxBooksLimit;
		result = prime * result + ((memberLoans == null) ? 0 : memberLoans.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + ((statusOfIssues == null) ? 0 : statusOfIssues.hashCode());
		result = prime * result + ((statusOfReturns == null) ? 0 : statusOfReturns.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fines == null) {
			if (other.fines != null)
				return false;
		} else if (!fines.equals(other.fines))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maxBooksLimit != other.maxBooksLimit)
			return false;
		if (memberLoans == null) {
			if (other.memberLoans != null)
				return false;
		} else if (!memberLoans.equals(other.memberLoans))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
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
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [ID=" + ID + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + ", zipCode=" + zipCode + ", city=" + city
				+ ", phoneNo=" + phoneNo + ", registrationDate=" + registrationDate + ", maxBooksLimit=" + maxBooksLimit
				+ "]";
	}

	


	
}
