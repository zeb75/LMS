package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.TextBook;

public interface TextBookDao extends JpaRepository<TextBook,Integer>{

}
