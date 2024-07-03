package com.serey.qa_api_sample.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.serey.qa_api_sample.dto.QuestionDto;
import com.serey.qa_api_sample.entity.Questions;
import com.serey.qa_api_sample.mapper.QuestionMapper;
import com.serey.qa_api_sample.repository.QuestionRepository;
import com.serey.qa_api_sample.service.QuestionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestionSeviceImpl implements QuestionService {
    
    private final QuestionRepository questionRepository;

    @Override
    public QuestionDto createQuestion(QuestionDto questionDto){
        
       Questions question = QuestionMapper.mapToQuestions(questionDto);
       Questions savedQuestions = questionRepository.save(question);

        return QuestionMapper.mapToQuestionDto(savedQuestions);
    }

    @Override
    public List<QuestionDto> getQuestions(){
        List<Questions> questions =  questionRepository.findAll();
        return questions.stream().map((question) -> QuestionMapper.mapToQuestionDto(question)).collect(Collectors.toList());
    }
}
