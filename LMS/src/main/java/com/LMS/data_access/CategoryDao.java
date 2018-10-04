package com.LMS.data_access;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LMS.models.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{
	


}
