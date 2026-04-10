package com.example.bookstore.BookStore.controller;

import com.example.bookstore.BookStore.entity.Book;
import com.example.bookstore.BookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
    @GetMapping("/getBook/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBook(id);
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }
}
