package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Supplier;

public interface SupplierDao extends JpaRepository<Supplier,Integer>{

}
