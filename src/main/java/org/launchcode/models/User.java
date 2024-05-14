package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Username is required")
    @Size(min=5, max=5, message = "Username must be between 5 and 15 characters")
    private String username;
    @Email(message = "Email must be a valid email address")
    private String email;
    @NotBlank(message = "Password is required")
    @Min(value = 6, message = "Password must be at least 6 characters long")
    private String password;
    private int id;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

