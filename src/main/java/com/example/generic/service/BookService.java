package com.example.generic.service;

import com.example.generic.dto.BookDTO;
import com.example.generic.entity.BookDO;
import com.example.generic.enums.StatusEnum;
import com.example.generic.enums.TypeEnum;
import com.example.generic.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Meow
 */
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepo bookRepo;
    private final Random random;

    public List<BookDTO> listBooks() {
        return bookRepo.findAll().stream().map(this::toBookDTO).toList();
    }

    public BookDTO getBook(String id) {
        return bookRepo.findById(id)
                .map(this::toBookDTO)
                .orElseThrow();
    }

    private BookDTO toBookDTO(final BookDO bookDO) {
        return BookDTO.builder()
                .id(bookDO.getId())
                .status(bookDO.getStatus())
                .type(bookDO.getType())
                .typeText(bookDO.getType().getText())
                .build();
    }


    public void create() {
        int statusLen = StatusEnum.values().length;
        int typeLen = TypeEnum.values().length;
        BookDO bookDO = BookDO.builder()
                .status(StatusEnum.values()[random.nextInt(statusLen)])
                .type(TypeEnum.values()[random.nextInt(typeLen)])
                .build();
        bookRepo.save(bookDO);
    }
}
