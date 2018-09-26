package com.LMS.models;

import javax.persistence.Entity;

@Entity
public class StoryBook extends GeneralBook {

	private String storyType;
	private int volumeNo;
	private int noOfStories;
	public String getStoryType() {
		return storyType;
	}
	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	public int getVolumeNo() {
		return volumeNo;
	}
	public void setVolumeNo(int volumeNo) {
		this.volumeNo = volumeNo;
	}
	public int getNoOfStories() {
		return noOfStories;
	}
	public void setNoOfStories(int noOfStories) {
		this.noOfStories = noOfStories;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + noOfStories;
		result = prime * result + ((storyType == null) ? 0 : storyType.hashCode());
		result = prime * result + volumeNo;
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
		StoryBook other = (StoryBook) obj;
		if (noOfStories != other.noOfStories)
			return false;
		if (storyType == null) {
			if (other.storyType != null)
				return false;
		} else if (!storyType.equals(other.storyType))
			return false;
		if (volumeNo != other.volumeNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StoryBook [storyType=" + storyType + ", volumeNo=" + volumeNo + ", noOfStories=" + noOfStories + "]";
	}
	
	
}
