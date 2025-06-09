package com.example.goodreads;

import java.util.ArrayList;
import com.example.goodreads.Book;

public interface BookRepo {
    public ArrayList<Book> getBooks();
    public Book getBook(int bookId);
}