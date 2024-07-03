package com.serey.qa_api_sample.mapper;

import com.serey.qa_api_sample.dto.QuestionDto;
import com.serey.qa_api_sample.entity.Questions;

public class QuestionMapper {
    public static QuestionDto mapToQuestionDto(Questions questions) {
        return new QuestionDto(
            questions.getId(),
            questions.getQuestions(),
            questions.getQuestionType(),
            questions.getAnswer(),
            questions.getChoice()
        );
    }

    public static Questions mapToQuestions (QuestionDto questionDto) {
        return new Questions(
            questionDto.getId(),
            questionDto.getQuestions(),
            questionDto.getQuestionType(),
            questionDto.getAnswer(),
            questionDto.getChoice()
        );
        
    }
}
