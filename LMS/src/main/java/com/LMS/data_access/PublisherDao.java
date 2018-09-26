package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Publisher;

public interface PublisherDao extends JpaRepository<Publisher,Integer>{

}
