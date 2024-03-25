package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "editorial")
@Data
public class EditorialEntity {
  @Id
  Long editorial_id;

  String name;
}
