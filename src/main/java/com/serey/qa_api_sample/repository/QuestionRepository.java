package com.serey.qa_api_sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serey.qa_api_sample.entity.Questions;

public interface  QuestionRepository extends JpaRepository<Questions, Long> {
    
}
