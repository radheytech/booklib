package com.cola.librarymanagementapi.service;

import com.cola.librarymanagementapi.model.Book;
import com.cola.librarymanagementapi.model.Borrower;
import com.cola.librarymanagementapi.repository.BookRepository;
import com.cola.librarymanagementapi.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowerRepository borrowerRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void borrowBook(Long borrowerId, Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        if (book.isBorrowed()) {
            throw new RuntimeException("Book is already borrowed");
        }
        book.setBorrowed(true);
        bookRepository.save(book);
    }

    public void returnBook(Long borrowerId, Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setBorrowed(false);
        bookRepository.save(book);
    }
}