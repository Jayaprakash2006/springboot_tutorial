package com.example.goodreads;

public class Book {
    private int bookId;
    private String name;
    private String imageUrl;

    public Book(int bookId, String name, String imageUrl) {
        this.bookId = bookId;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public int getBookId() {
        return this.bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}