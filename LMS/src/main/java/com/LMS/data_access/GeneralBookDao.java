package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.GeneralBook;

public interface GeneralBookDao extends JpaRepository<GeneralBook,Integer>{

}
