package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BookEntity {
  @Id
  Long book_id;

  String title;
  String description;
  Boolean available;
  String publicationdate;
}
