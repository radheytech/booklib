package com.cola.librarymanagementapi.repository;

import com.example.library.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
