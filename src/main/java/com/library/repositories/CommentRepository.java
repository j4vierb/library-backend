package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>{}
