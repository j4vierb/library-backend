package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "comment")
@Data
public class CommentEntity {
  @Id
  Long comment_id;

  String header;
  String body;

  @ManyToOne
  BookEntity book;

  @ManyToOne
  CriticEntity critic;
}
