package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.BookEntity;
import com.library.repositories.BookRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookService {
  @Autowired
  private BookRepository bookRepository;

  @Transactional
  public BookEntity createBook(BookEntity book) {
    log.info("Creating book with id: {}", book.getId());
    log.info("Finish creating book with id: {}", book.getId());
    return bookRepository.save(book);
  }

  @Transactional
  public List<BookEntity> getBooks() {
    log.info("Getting all books");
    return bookRepository.findAll();
  }

  @Transactional
  public BookEntity getBookById(Long id) {
    log.info("Getting book with id: {}", id);
    Optional<BookEntity> book = bookRepository.findById(id);
    log.info("Finish getting book with id: {}", id);
    return book.get();
  }

  @Transactional
  public BookEntity updateBook(Long id, BookEntity book) {
    log.info("Updating book with id: {}", id);
    Optional<BookEntity> bookData = bookRepository.findById(id);

    log.info("Finish updating book with id: {}", id);
    return bookRepository.save(bookData.get());
  }

  @Transactional
  public void deleteBook(Long id) {
    log.info("Deleting book with id: {}", id);
    bookRepository.deleteById(id);
    log.info("Finish deleting book with id: {}", id);
  }
}
