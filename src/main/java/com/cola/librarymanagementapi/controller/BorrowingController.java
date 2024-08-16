package com.cola.librarymanagementapi.controller;

import com.example.library.model.Book;
import com.example.library.model.Borrower;
import com.example.library.service.BookService;
import com.example.library.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrowers/{borrowerId}")
public class BorrowingController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping("/borrow/{bookId}")
    public void borrowBook(@PathVariable Long borrowerId, @PathVariable Long bookId) {
        // Implement borrowing logic here
    }

    @PostMapping("/return/{bookId}")
    public void returnBook(@PathVariable Long borrowerId, @PathVariable Long bookId) {
        // Implement returning logic here
    }
}
