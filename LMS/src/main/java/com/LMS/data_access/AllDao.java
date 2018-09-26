package com.LMS.data_access;

import org.springframework.beans.factory.annotation.Autowired;

public class AllDao {

	@Autowired
	private BillDao billDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private FacultyDao facultyDao;
	
	@Autowired
	private FineDao fineDao;
	
	@Autowired
	private GeneralBookDao generalBookDao;
	
	@Autowired
	private JournalDao journalDao;
	
	@Autowired
	private LibrarianDao librarianDao;
	
	@Autowired
	private MagazineDao magazineDao;
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private PublisherDao publisherDao;
	
	@Autowired
	private ReferenceBookDao referenceBookDao;
	
	@Autowired
	private StatusOfIssueDao statusOfIssueDao;
	
	@Autowired
	private StatusOfReturnDao statusOfReturnDao;
	
	@Autowired
	private StoryBookDao storyBookDao;
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Autowired
	private TextBookDao textBookDao;
	
	@Autowired
	private TransactionDao transactionDao;
}
