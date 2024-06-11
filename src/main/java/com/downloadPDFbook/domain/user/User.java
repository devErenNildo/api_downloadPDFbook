package com.downloadPDFbook.domain.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = UserRole.USER;
    }
}
