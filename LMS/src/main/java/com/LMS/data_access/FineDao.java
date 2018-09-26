package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Fine;

public interface FineDao extends JpaRepository<Fine,Integer> {

}
