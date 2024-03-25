package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "character")
@Data
public class CharacterEntity {
  @Id
  Long character_id;

  String name;
  String description;

  @ManyToOne
  BookEntity book;
}
