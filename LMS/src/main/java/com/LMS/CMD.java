//package com.LMS;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.LMS.data_access.AuthorDao;
//import com.LMS.data_access.BookDao;
//import com.LMS.models.Book;
//
//@Component
//@Transactional
//public class CMD implements CommandLineRunner{
//
//	private BookDao bookDao;
//	private AuthorDao authorDao;
//	
//	
//	@Autowired
//	public CMD(BookDao bookDao, com.LMS.data_access.AuthorDao authorDao) {
//		super();
//		this.bookDao = bookDao;
//		this.authorDao = authorDao;
//	}
//
//
//
//	@Override
//	public void run(String... args) throws Exception {
//		Book b = new Book();
//		b.addAuthor(authorDao.findById(7).orElse(null));
//		System.out.println(bookDao.save(b));
//		
//	}
//	
//	
//
//}
