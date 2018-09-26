package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class ReferenceBook extends Book {
	
private int ID;
private String returnLimit;
public String getReturnLimit() {
	return returnLimit;
}
public void setReturnLimit(String returnLimit) {
	this.returnLimit = returnLimit;
}
public int getID() {
	return ID;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ID;
	result = prime * result + ((returnLimit == null) ? 0 : returnLimit.hashCode());
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
	ReferenceBook other = (ReferenceBook) obj;
	if (ID != other.ID)
		return false;
	if (returnLimit == null) {
		if (other.returnLimit != null)
			return false;
	} else if (!returnLimit.equals(other.returnLimit))
		return false;
	return true;
}
@Override
public String toString() {
	return "ReferenceBook [ID=" + ID + ", returnLimit=" + returnLimit + "]";
}


}
