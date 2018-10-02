package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Author;

public interface AuthorDao extends JpaRepository<Author, Integer>{

}
