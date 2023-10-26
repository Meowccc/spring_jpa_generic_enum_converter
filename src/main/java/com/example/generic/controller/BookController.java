package com.example.generic.controller;

import com.example.generic.dto.BookDTO;
import com.example.generic.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Meow
 */
@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("{id}")
    public BookDTO getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @GetMapping()
    public List<BookDTO> listBooks() {
        return bookService.listBooks();
    }

    @PostMapping
    public void save() {
        bookService.create();
    }
}
