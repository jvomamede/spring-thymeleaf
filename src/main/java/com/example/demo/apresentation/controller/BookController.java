package com.example.demo.apresentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.infra.service.BookService;

@Controller
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String books(Model model) {
        String[] books = this.bookService.books();
        model.addAttribute("books", books);
        return "books";
    }

}
