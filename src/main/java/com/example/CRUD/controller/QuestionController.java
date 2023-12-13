package com.example.CRUD.controller;

import com.example.CRUD.entity.Question;
import com.example.CRUD.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Question> questions = questionService.showList();
        model.addAttribute("questions", questions);
        return "main";
    }

    @GetMapping("/write")
    public String write(String subject, String content) {
        questionService.write(subject, content);
        return "write";
    }

    public String detail(Model model, long id) {
        Question question = questionService.getQuestion(id);
        return "detail";
    }
}