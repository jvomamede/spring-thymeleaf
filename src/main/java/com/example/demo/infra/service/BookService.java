package com.example.demo.infra.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    public String[] books() {
        ArrayList<String> books = new ArrayList<String>();
        books.add("The Hobbit");
        books.add("The Lord of the Rings");
        return books.toArray(new String[0]);
    }

}
