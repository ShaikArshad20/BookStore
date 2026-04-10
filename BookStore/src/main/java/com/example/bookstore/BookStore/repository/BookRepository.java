package com.example.bookstore.BookStore.repository;

import com.example.bookstore.BookStore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Book, Long> {
}
