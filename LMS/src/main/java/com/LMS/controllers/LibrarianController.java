package com.LMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.LMS.data_access.LibrarianDao;
import com.LMS.models.Librarian;

@Controller
public class LibrarianController {

	@Autowired
	private LibrarianDao librarianDao;

@GetMapping("/librarian")
public String librarian(Model model)
{
	Librarian emptyLibrarian = new Librarian();
	model.addAttribute("librarian", emptyLibrarian);
	return "librarian";
}

@PostMapping("/librarian")
public String addLibrarian(@ModelAttribute("librarian")Librarian librarian) {
	librarian = librarianDao.save(librarian);
	return "librarian";
}
	
}
