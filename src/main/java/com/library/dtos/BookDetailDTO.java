package com.library.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDetailDTO extends BookDTO {
  private List<AuthorDTO> authors = new ArrayList<>();
  private List<CharacterDTO> characters = new ArrayList<>();
  private List<CommentDTO> comments = new ArrayList<>();
}
