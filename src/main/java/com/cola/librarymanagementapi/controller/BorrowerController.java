package com.cola.librarymanagementapi.controller;

import com.example.library.model.Borrower;
import com.example.library.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }

    @PostMapping
    public Borrower addBorrower(@RequestBody Borrower borrower) {
        return borrowerService.saveBorrower(borrower);
    }
}
