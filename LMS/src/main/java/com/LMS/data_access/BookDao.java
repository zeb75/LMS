package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Book;

public interface BookDao extends JpaRepository<Book,Integer>{

}
