package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.EditorialEntity;

public interface EditorialRepository extends JpaRepository<EditorialEntity, Long> {}
