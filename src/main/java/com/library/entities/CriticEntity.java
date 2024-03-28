package com.library.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "critic")
@Data
public class CriticEntity {
  @Id
  Long id;
  
  String firstname;
  String lastname;

  @OneToMany(mappedBy = "critic")
  List<CommentEntity> comments = new ArrayList<>();
}
