package com.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.CommentEntity;
import com.library.repositories.CommentRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CommentService {
  @Autowired
  private CommentRepository commentRepository;

  @Transactional
  public CommentEntity createComment(CommentEntity comment) {
    log.info("Creating comment with id: {}", comment.getId());
    log.info("Finish creating comment with id: {}", comment.getId());
    return commentRepository.save(comment);
  }

  @Transactional
  public List<CommentEntity> getComments() {
    log.info("Getting all comments");
    return commentRepository.findAll();
  }

  @Transactional
  public CommentEntity getCommentById(Long id) {
    log.info("Getting comment with id: {}", id);
    Optional<CommentEntity> comment = commentRepository.findById(id);
    log.info("Finish getting comment with id: {}", id);
    return comment.get();
  }

  @Transactional
  public CommentEntity updateComment(Long id, CommentEntity comment) {
    log.info("Updating comment with id: {}", id);
    Optional<CommentEntity> commentData = commentRepository.findById(id);

    log.info("Finish updating comment with id: {}", id);
    return commentRepository.save(commentData.get());
  }

  @Transactional
  public void deleteComment(Long id) {
    log.info("Deleting comment with id: {}", id);
    commentRepository.deleteById(id);
    log.info("Finish deleting comment with id: {}", id);
  }
}
