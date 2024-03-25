package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "critic")
@Data
public class CriticEntity {
  @Id
  Long critic_id;
  
  String firstname;
  String lastname;
}
