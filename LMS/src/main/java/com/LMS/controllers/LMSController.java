package com.LMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.LMS.data_access.BillDao;
import com.LMS.data_access.BookDao;
import com.LMS.data_access.CategoryDao;
import com.LMS.data_access.FineDao;
import com.LMS.data_access.LibrarianDao;
import com.LMS.data_access.MemberDao;
import com.LMS.data_access.StatusOfIssueDao;
import com.LMS.data_access.StatusOfReturnDao;


@Controller
public class LMSController {

	@Autowired
	private BillDao billDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private FineDao fineDao;
	
	@Autowired
	private LibrarianDao librarianDao;
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private StatusOfIssueDao statusOfIssueDao;
	
	@Autowired
	private StatusOfReturnDao statusOfReturnDao;


@GetMapping("/index")
public String index()
{
return "index";
}
}
