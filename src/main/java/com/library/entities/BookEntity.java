package com.library.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

  @ManyToMany
  List<AuthorEntity> authors;

  @OneToMany(mappedBy = "book")
  List<CharacterEntity> characters;

  @OneToMany(mappedBy = "book")
  List<CommentEntity> comments;

  @ManyToOne
  EditorialEntity editorial;
}
