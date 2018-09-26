package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Transaction;

public interface TransactionDao extends JpaRepository<Transaction,Integer>{

}
