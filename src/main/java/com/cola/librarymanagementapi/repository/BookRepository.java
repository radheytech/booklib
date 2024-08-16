package com.cola.librarymanagementapi.repository;

import com.cola.librarymanagementapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author radhey
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}