package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Magazine;

public interface MagazineDao extends JpaRepository<Magazine,Integer>{

}
