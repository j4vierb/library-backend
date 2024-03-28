package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.AuthorEntity;
import com.library.repositories.AuthorRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AuthorService {
  @Autowired
  private AuthorRepository authorRepository;

  @Transactional
  public AuthorEntity createAuthor(AuthorEntity author) {
    log.info("Creating author with id: {}", author.getId());
    log.info("Finish creating author with id: {}", author.getId());
    return authorRepository.save(author);
  }

  @Transactional
  public List<AuthorEntity> getAuthors() {
    log.info("Getting all authors");
    return authorRepository.findAll();
  }

  @Transactional
  public AuthorEntity getAuthorById(Long id) {
    log.info("Getting author with id: {}", id);
    Optional<AuthorEntity> author = authorRepository.findById(id);
    log.info("Finish getting author with id: {}", id);
    return author.get();
  }

  @Transactional
  public AuthorEntity updateAuthor(Long id, AuthorEntity author) {
    log.info("Updating author with id: {}", id);
    Optional<AuthorEntity> authorData = authorRepository.findById(id);

    log.info("Finish updating author with id: {}", id);
    return authorRepository.save(authorData.get());
  }

  @Transactional
  public void deleteAuthor(Long id) {
    log.info("Deleting author with id: {}", id);
    authorRepository.deleteById(id);
    log.info("Finish deleting author with id: {}", id);
  }
}
