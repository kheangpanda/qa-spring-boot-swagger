package com.serey.qa_api_sample.service;

import java.util.List;

import com.serey.qa_api_sample.dto.QuestionDto;

public interface QuestionService {
    QuestionDto createQuestion(QuestionDto questionDto);

    List<QuestionDto> getQuestions();
}
