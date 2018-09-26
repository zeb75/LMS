package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.ReferenceBook;

public interface ReferenceBookDao extends JpaRepository<ReferenceBook,Integer>{

}
