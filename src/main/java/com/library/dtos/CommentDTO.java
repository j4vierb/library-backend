package com.library.dtos;

import lombok.Data;

@Data
public class CommentDTO {
  private Long id;
  private String header;
  private String body;
  private BookDTO book;
  private CriticDTO critic;
}
