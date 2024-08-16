package com.cola.librarymanagementapi.repository;

import com.cola.librarymanagementapi.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author radhey
 */
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}