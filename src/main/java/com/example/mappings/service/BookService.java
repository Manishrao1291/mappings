package com.example.mappings.service;

import com.example.mappings.repo.BookRepo;
import com.example.mappings.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    @Autowired
    BookRepo bookRepo;



    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }
    
}
