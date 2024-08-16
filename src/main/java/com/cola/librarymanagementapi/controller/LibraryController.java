package com.cola.librarymanagementapi.controller;

import com.cola.librarymanagementapi.model.Book;
import com.cola.librarymanagementapi.model.Borrower;
import com.cola.librarymanagementapi.service.BookService;
import com.cola.librarymanagementapi.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author radhey
 */
@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping("/borrower")
    public ResponseEntity<Borrower> registerBorrower(@RequestBody Borrower borrower) {
        return ResponseEntity.ok(borrowerService.saveBorrower(borrower));
    }

    @PostMapping("/book")
    public ResponseEntity<Book> registerBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.saveBook(book));
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping("/borrow/{borrowerId}/{bookId}")
    public ResponseEntity<String> borrowBook(@PathVariable Long borrowerId, @PathVariable Long bookId) {
        bookService.borrowBook(borrowerId, bookId);
        return ResponseEntity.ok("Book borrowed successfully");
    }

    @PostMapping("/return/{borrowerId}/{bookId}")
    public ResponseEntity<String> returnBook(@PathVariable Long borrowerId, @PathVariable Long bookId) {
        bookService.returnBook(borrowerId, bookId);
        return ResponseEntity.ok("Book returned successfully");
    }
}
