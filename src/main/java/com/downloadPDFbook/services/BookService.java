package com.downloadPDFbook.services;

import com.downloadPDFbook.domain.book.Book;
import com.downloadPDFbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
}
