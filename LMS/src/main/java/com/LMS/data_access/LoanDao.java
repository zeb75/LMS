package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Loan;

public interface LoanDao extends JpaRepository<Loan, Integer>{

}
