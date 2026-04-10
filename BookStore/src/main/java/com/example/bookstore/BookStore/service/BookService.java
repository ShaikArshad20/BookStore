package com.example.bookstore.BookStore.service;

import com.example.bookstore.BookStore.entity.Book;
import com.example.bookstore.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {

    @Autowired
    private BookRepository repo;

    public Book saveBook(Book book){
        return repo.save(book);
    }
    public Book getBook(Long bookId){
        return repo.findById(bookId).orElse(null);
    }
    public List<Book> getAllBooks(){
        return repo.findAll();
    }
    public Book update(Long bookId, Book book){
        Book existing=repo.findById(bookId).orElse(null);
        if(existing!=null){
            existing.setBookName(book.getBookName());
            existing.setAuthor(book.getAuthor());
            existing.setPrice(book.getPrice());
            return repo.save(existing);
        }
        return null;
    }
    public void deleteBook(Long id){
        repo.deleteById(id);
    }
}
