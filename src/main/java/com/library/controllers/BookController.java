package com.library.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.library.dtos.BookDetailDTO;
import com.library.entities.BookEntity;
import com.library.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
  @Autowired
  private BookService bookService;

  @Autowired
  private ModelMapper modelMapper;

  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  public List<BookDetailDTO> getBooks() {
    List<BookEntity> books = bookService.getBooks();
    return modelMapper.map(books, new TypeToken<List<BookDetailDTO>>() {}.getType());
  }
}
