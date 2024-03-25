package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class BookEntity {
  @Id
  Long book_id;

  String title;
  String description;
  Boolean available;
  String publicationdate;
}
