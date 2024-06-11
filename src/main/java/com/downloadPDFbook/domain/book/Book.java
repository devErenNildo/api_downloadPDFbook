package com.downloadPDFbook.domain.book;

import com.downloadPDFbook.domain.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "books")
public class Book {
    @Id
    private String id;
    @DBRef
    private User publicationAuthor;
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private String category;
    private String urlDownloadPDF;

}
