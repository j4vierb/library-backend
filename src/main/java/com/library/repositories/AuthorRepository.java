package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long>{}
