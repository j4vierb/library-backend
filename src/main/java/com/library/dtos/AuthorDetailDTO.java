package com.library.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDetailDTO extends AuthorDTO {
  private List<BookDTO> books = new ArrayList<>();
}
