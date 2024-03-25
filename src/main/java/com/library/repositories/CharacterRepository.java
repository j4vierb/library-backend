package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.CharacterEntity;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long>{}
