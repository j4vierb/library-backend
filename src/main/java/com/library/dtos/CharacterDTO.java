package com.library.dtos;

import lombok.Data;

@Data
public class CharacterDTO {
  private Long id;
  private String name;
  private String description;
  private BookDTO book;
}
