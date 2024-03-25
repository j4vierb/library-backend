package com.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CriticEntity {
  @Id
  Long critic_id;
  
  String firstname;
  String lastname;
}
