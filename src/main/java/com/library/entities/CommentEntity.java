package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CommentEntity {
  @Id
  Long comment_id;

  String header;
  String body;
}
