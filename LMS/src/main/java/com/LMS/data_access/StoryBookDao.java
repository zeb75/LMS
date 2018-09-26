package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.StoryBook;

public interface StoryBookDao extends JpaRepository<StoryBook,Integer>{

}
