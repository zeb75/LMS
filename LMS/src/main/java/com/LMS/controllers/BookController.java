package com.LMS.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.LMS.data_access.AuthorDao;
import com.LMS.data_access.BookDao;
import com.LMS.data_access.BookViewModel;
import com.LMS.data_access.CategoryDao;
import com.LMS.data_access.PublisherDao;
import com.LMS.models.Author;
import com.LMS.models.Book;
import com.LMS.models.Category;
import com.LMS.models.Publisher;

@Controller
public class BookController {
	
	@Autowired
	private AuthorDao authorDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private PublisherDao publisherDao;

@GetMapping("/index")
public String index()
{
return "index";
}


@GetMapping("/book")
public String book(Model model)
{
	BookViewModel bookViewModel = new BookViewModel();
	model.addAttribute("bookViewModel", bookViewModel);
	model.addAttribute("allCategories", categoryDao.findAll());
	model.addAttribute("allAuthors", authorDao.findAll());
	model.addAttribute("allPublishers", publisherDao.findAll());
	return "book";
}

@PostMapping("/book")
public String addBook(@ModelAttribute("bookViewModel")BookViewModel bookViewModel, Model model) 
{
	Book book = new Book();

	Optional<Category> op = categoryDao.findById(bookViewModel.getCategoryID());
	if (op.isPresent()){
	book.setCategory(op.get());}
	
	Optional<Author> op1 = authorDao.findById(bookViewModel.getAuthorID());
	if (op1.isPresent()){
	book.addAuthor(op1.get());
	}
	Optional<Publisher> op2 = publisherDao.findById(bookViewModel.getPublisherID());
	if (op2.isPresent()){
	book.setPublisher(op2.get());
	}
	book.setTitle(bookViewModel.getTitle());
	book.setISBNNo(bookViewModel.getISBNNo());
	book.setShelf(bookViewModel.getShelf());
	book.setStatus(bookViewModel.getStatus());
	book.setEdition(bookViewModel.getEdition());
	book.setDateOfPurchase(bookViewModel.getDateOfPurchase());
	book.setRefBook(bookViewModel.isRefBook());
	book.setDescription(bookViewModel.getDescription());
	
	book = bookDao.save(book);
	
	model.addAttribute("allCategories", categoryDao.findAll());
	model.addAttribute("allAuthors", authorDao.findAll());
	model.addAttribute("allPublishers", publisherDao.findAll());
	
	System.out.println(book);
	return "book";
}

@GetMapping("/author")
public String author(Model model)
{
	Author emptyAuthor = new Author();
	model.addAttribute("author", emptyAuthor);
	return "author";
}

@PostMapping("/author")
public String addAuthor(@ModelAttribute("author")Author author) {
	author = authorDao.save(author);
	return "author";
}

@GetMapping("/category")
public String category(Model model)
{
	Author emptyCategory = new Author();
	model.addAttribute("category", emptyCategory);
	return "Category";
}

@PostMapping("/category")
public String addCategory(@ModelAttribute("category")Category category) {
	category = categoryDao.save(category);
	return "category";
}

@GetMapping("/publisher")
public String publisher(Model model)
{
	Publisher emptyPublisher = new Publisher();
	model.addAttribute("publisher", emptyPublisher);
	return "publisher";
}

@PostMapping("/publisher")
public String addPublisher(@ModelAttribute("publisher")Publisher publisher) {
	publisher = publisherDao.save(publisher);
	return "publisher";
}
}

