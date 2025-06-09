package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.goodreads.GoodreadsService;
import com.example.goodreads.Book;
import java.util.*;

@RestController
class GoodreadsController {

    GoodreadsService service = new GoodreadsService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId) {
        return service.getBook(bookId);
    }
}