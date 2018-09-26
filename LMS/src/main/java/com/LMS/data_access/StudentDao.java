package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

}
