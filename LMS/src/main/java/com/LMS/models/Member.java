package com.LMS.models;

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
	private String type;
	private String dateOfMember;
	private int noBooksIssued;
	private int maxBookLimit;
	private String name;
	private String address;
	private String phoneNo;
	
	@OneToMany(mappedBy = "ID", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Loan> loans = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<Fine> fines = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfIssue> statusOfIssues = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} )
	private List<StatusOfReturn> statusOfReturns = new ArrayList<>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDateOfMember() {
		return dateOfMember;
	}
	public void setDateOfMember(String dateOfMember) {
		this.dateOfMember = dateOfMember;
	}
	public int getNoBooksIssued() {
		return noBooksIssued;
	}
	public void setNoBooksIssued(int noBooksIssued) {
		this.noBooksIssued = noBooksIssued;
	}
	public int getMaxBookLimit() {
		return maxBookLimit;
	}
	public void setMaxBookLimit(int maxBookLimit) {
		this.maxBookLimit = maxBookLimit;
	}
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
	public int getID() {
		return ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dateOfMember == null) ? 0 : dateOfMember.hashCode());
		result = prime * result + maxBookLimit;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noBooksIssued;
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (dateOfMember == null) {
			if (other.dateOfMember != null)
				return false;
		} else if (!dateOfMember.equals(other.dateOfMember))
			return false;
		if (maxBookLimit != other.maxBookLimit)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noBooksIssued != other.noBooksIssued)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Member [ID=" + ID + ", type=" + type + ", dateOfMember=" + dateOfMember + ", noBooksIssued="
				+ noBooksIssued + ", maxBookLimit=" + maxBookLimit + ", name=" + name + ", address=" + address
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
