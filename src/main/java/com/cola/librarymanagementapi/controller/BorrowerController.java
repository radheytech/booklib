package com.cola.librarymanagementapi.controller;

import com.example.library.model.Borrower;
import com.example.library.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing borrowers.
 * This class provides endpoints for retrieving and adding borrowers.
 * @author radhey
 */
@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    /**
     * Retrieves all borrowers.
     * @return a list of all borrowers.
     */
    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }

    /**
     * Adds a new borrower.
     * @param borrower the borrower to add.
     * @return the added borrower.
     */
    @PostMapping
    public Borrower addBorrower(@RequestBody Borrower borrower) {
        return borrowerService.saveBorrower(borrower);
    }
}
