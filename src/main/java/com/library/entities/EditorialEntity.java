package com.library.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "editorial")
@Data
public class EditorialEntity {
  @Id
  Long editorial_id;

  String name;

  @OneToMany(mappedBy = "editorial")
  List<BookEntity> books;
}
