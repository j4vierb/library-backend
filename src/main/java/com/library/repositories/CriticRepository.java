package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.CriticEntity;

public interface CriticRepository extends JpaRepository<CriticEntity, Long>{}
