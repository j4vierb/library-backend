package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long>{}
