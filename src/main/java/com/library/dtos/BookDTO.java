package com.library.dtos;

import lombok.Data;

@Data
public class BookDTO {
  private Long book_id;
  private String title;
  private String description;
  private Boolean available;
  private String publicationdate;
}
