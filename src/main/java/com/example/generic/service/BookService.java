package com.example.generic.service;

import com.example.generic.entity.BookDO;
import com.example.generic.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Meow
 */
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepo bookRepo;

    public void test() {

        BookDO bookDO = BookDO.builder()


                .build();
        bookRepo.save(bookDO);
    }
}
