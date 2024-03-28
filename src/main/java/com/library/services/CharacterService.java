package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.CharacterEntity;
import com.library.repositories.CharacterRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CharacterService {
  @Autowired
  private CharacterRepository characterRepository;

  @Transactional
  public CharacterEntity createCharacter(CharacterEntity character) {
    log.info("Creating character with id: {}", character.getId());
    log.info("Finish creating character with id: {}", character.getId());
    return characterRepository.save(character);
  }

  @Transactional
  public List<CharacterEntity> getCharacters() {
    log.info("Getting all characters");
    return characterRepository.findAll();
  }

  @Transactional
  public CharacterEntity getCharacterById(Long id) {
    log.info("Getting character with id: {}", id);
    Optional<CharacterEntity> character = characterRepository.findById(id);
    log.info("Finish getting character with id: {}", id);
    return character.get();
  }

  @Transactional
  public CharacterEntity updateCharacter(Long id, CharacterEntity character) {
    log.info("Updating character with id: {}", id);
    Optional<CharacterEntity> characterData = characterRepository.findById(id);

    log.info("Finish updating character with id: {}", id);
    return characterRepository.save(characterData.get());
  }

  @Transactional
  public void deleteCharacter(Long id) {
    log.info("Deleting character with id: {}", id);
    characterRepository.deleteById(id);
    log.info("Finish deleting character with id: {}", id);
  }
}
