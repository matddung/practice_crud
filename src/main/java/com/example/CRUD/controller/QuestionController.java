package com.example.CRUD.controller;

import com.example.CRUD.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/write")
    public String Write(String subject, String content) {
        questionService.write(subject, content);
        return "Write";
    }
}