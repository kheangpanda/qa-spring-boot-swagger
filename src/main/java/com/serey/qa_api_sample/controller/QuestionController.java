package com.serey.qa_api_sample.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serey.qa_api_sample.dto.QuestionDto;
import com.serey.qa_api_sample.service.QuestionService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/api/questions")
@Tag(name = "Questions", description = "API for managing questions")
public class QuestionController {
    
    private final QuestionService questionService;

    // Build Add Employee REST API 
    @PostMapping
    public ResponseEntity<QuestionDto> createQuestion(@RequestBody QuestionDto questionDto){
        System.out.println("questionDto");
        System.out.println(questionDto.getChoice());
        QuestionDto savedQuestion = questionService.createQuestion(questionDto);
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<QuestionDto>> getQuestions() {
        List<QuestionDto> questions =  questionService.getQuestions();
        return ResponseEntity.ok(questions);
    }
    

}
