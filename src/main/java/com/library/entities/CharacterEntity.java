package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CharacterEntity {
  @Id
  Long character_id;

  String name;
  String description;
}
