package com.library.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "author")
@Data
public class AuthorEntity {
  @Id
  Long author_id;

  String firstname;
  String lastname;

  @ManyToMany(mappedBy = "authors")
  List<BookEntity> books;
}
