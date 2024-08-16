package com.cola.librarymanagementapi.service;

import com.cola.librarymanagementapi.model.Borrower;
import com.cola.librarymanagementapi.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    public Borrower saveBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }
}