package com.downloadPDFbook.controller;

import com.downloadPDFbook.domain.book.Book;
import com.downloadPDFbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

//    @PostMapping("/add")
//    public ResponseEntity<Book> addBook(@RequestBody){
//
//    }

}
