package com.downloadPDFbook.domain.book;

import com.downloadPDFbook.domain.user.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "books")
public class Book {
    @Id
    private String id;
    @DBRef
    private User userWhoShared;
    private String title;
    private String urlDownloadPDF;

    public Book(User userWhoShared, String title, String urlDownloadPDF){
        this.userWhoShared = userWhoShared;
        this.title = title;
        this.urlDownloadPDF = urlDownloadPDF;
    }
}
