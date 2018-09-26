package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Faculty;

public interface FacultyDao extends JpaRepository<Faculty,Integer> {

}
