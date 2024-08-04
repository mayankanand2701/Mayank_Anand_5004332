package com.library.service;
import com.library.repository.BookRepository;

// Step 3
public class BookService
{
	private BookRepository bookRepository;

	 // Default constructor
    public BookService() 
    {
    }
    
    public BookService(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public void manageBooks()
    {
        System.out.println("Books Managed in the library.");
        bookRepository.recordBook();
    }
    
 // Setter for bookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
