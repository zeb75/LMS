package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Librarian;

public interface LibrarianDao extends JpaRepository<Librarian,Integer>{

}
