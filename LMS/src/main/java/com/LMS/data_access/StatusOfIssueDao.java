package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.StatusOfIssue;

public interface StatusOfIssueDao extends JpaRepository<StatusOfIssue,Integer> {

}
