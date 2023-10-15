package com.example.demo.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
