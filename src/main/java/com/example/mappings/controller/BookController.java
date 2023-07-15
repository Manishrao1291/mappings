package com.example.mappings.controller;

import com.example.mappings.model.Book;
import com.example.mappings.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully";
    }

    @GetMapping("books")
    public Iterable<Book> getAllBooks() {
        return bookService.getAllBooks();
    }



    @DeleteMapping("delette/{id}")
    public void deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }
}


