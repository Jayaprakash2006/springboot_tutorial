package com.example.goodreads;

import java.util.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.goodreads.Book;
import com.example.goodreads.BookRepo;

public class GoodreadsService implements BookRepo{

    private HashMap<Integer, Book> hmap = new HashMap<>();

    public GoodreadsService() {
        Book b1 = new Book(101, "Harry Potter", "harry_potter.jpeg");
        Book b2 = new Book(102, "The Jack and Sparrow", "jack_sparrow.jpeg");
        hmap.put(b1.getBookId(), b1);
        hmap.put(b2.getBookId(), b2);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> hbook = hmap.values();
        ArrayList<Book> list = new ArrayList<>(hbook);
        return list;
    }

    @Override
    public Book getBook(int bookId) {
        Book book = hmap.get(bookId);
        if(book == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return book;
    }
}