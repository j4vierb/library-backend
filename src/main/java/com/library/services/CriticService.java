package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.CriticEntity;
import com.library.repositories.CriticRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CriticService {
  @Autowired
  private CriticRepository criticRepository;

  @Transactional
  public CriticEntity createCritic(CriticEntity critic) {
    log.info("Creating critic with id: {}", critic.getCritic_id());
    log.info("Finish creating critic with id: {}", critic.getCritic_id());
    return criticRepository.save(critic);
  }

  @Transactional
  public List<CriticEntity> getCritics() {
    log.info("Getting all critics");
    return criticRepository.findAll();
  }

  @Transactional
  public CriticEntity getCriticById(Long id) {
    log.info("Getting critic with id: {}", id);
    Optional<CriticEntity> critic = criticRepository.findById(id);
    log.info("Finish getting critic with id: {}", id);
    return critic.get();
  }

  @Transactional
  public CriticEntity updateCritic(Long id, CriticEntity critic) {
    log.info("Updating critic with id: {}", id);
    Optional<CriticEntity> criticData = criticRepository.findById(id);

    log.info("Finish updating critic with id: {}", id);
    return criticRepository.save(criticData.get());
  }

  @Transactional
  public void deleteCritic(Long id) {
    log.info("Deleting critic with id: {}", id);
    criticRepository.deleteById(id);
    log.info("Finish deleting critic with id: {}", id);
  }
}
