package com.serey.qa_api_sample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {

    private Long id ;
    private String questions;
    private Long questionType;
    private String choice;
    private String answer;


}
    
