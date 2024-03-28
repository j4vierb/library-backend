package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.EditorialEntity;
import com.library.repositories.EditorialRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EditorialService {
  @Autowired
  private EditorialRepository editorialRepository;

  @Transactional
  public EditorialEntity createEditorial(EditorialEntity editorial) {
    log.info("Creating editorial with id: {}", editorial.getEditorial_id());
    log.info("Finish creating editorial with id: {}", editorial.getEditorial_id());
    return editorialRepository.save(editorial);
  }

  @Transactional
  public List<EditorialEntity> getEditorials() {
    log.info("Getting all editorials");
    return editorialRepository.findAll();
  }

  @Transactional
  public EditorialEntity getEditorialById(Long id) {
    log.info("Getting editorial with id: {}", id);
    Optional<EditorialEntity> editorial = editorialRepository.findById(id);
    log.info("Finish getting editorial with id: {}", id);
    return editorial.get();
  }

  @Transactional
  public EditorialEntity updateEditorial(Long id, EditorialEntity editorial) {
    log.info("Updating editorial with id: {}", id);
    Optional<EditorialEntity> editorialData = editorialRepository.findById(id);

    log.info("Finish updating editorial with id: {}", id);
    return editorialRepository.save(editorialData.get());
  }

  @Transactional
  public void deleteEditorial(Long id) {
    log.info("Deleting editorial with id: {}", id);
    editorialRepository.deleteById(id);
    log.info("Finish deleting editorial with id: {}", id);
  }
}
