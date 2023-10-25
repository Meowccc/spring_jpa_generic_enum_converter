package com.example.generic.controller;

import com.example.generic.entity.BookDO;
import com.example.generic.enums.StatusEnum;
import com.example.generic.enums.TypeEnum;
import com.example.generic.repo.BookRepo;
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

    private final BookRepo bookRepo;

    @GetMapping("{id}")
    public BookDO getBook(@PathVariable String id) {
        return bookRepo.findById(id).orElseThrow();
    }

    @GetMapping()
    public List<BookDO> listBooks() {
        return bookRepo.findAll();
    }

    @PostMapping
    public void save() {
        bookRepo.save(BookDO.builder()
                .status(StatusEnum.ACTIVE)
                .type(TypeEnum.IN)
                .build());
    }
}
