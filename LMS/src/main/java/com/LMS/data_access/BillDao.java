package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Bill;

public interface BillDao extends JpaRepository<Bill,Integer>{

}
