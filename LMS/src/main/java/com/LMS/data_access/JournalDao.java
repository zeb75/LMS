package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Journal;

public interface JournalDao extends JpaRepository<Journal,Integer>{

}
