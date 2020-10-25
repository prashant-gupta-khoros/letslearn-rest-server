package com.letslearn.letslearnrestserver.controller;

import com.letslearn.letslearnrestserver.model.Author;
import com.letslearn.letslearnrestserver.model.Book;
import com.letslearn.letslearnrestserver.model.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class WebController {

    @RequestMapping("/getBooks")
    public List<Book> getBooks() {
        return Repository.BOOKS;
    }

    @RequestMapping("/getAuthors")
    public List<Author> getAuthors() {
        return Repository.AUTHORS;
    }

    @RequestMapping("/getAuthorById")
    public Author getAuthorById(@RequestParam(value = "authorId") String authorId) {
        return Repository.AUTHORS.stream().filter(author -> author.getId().equals(authorId)).collect(Collectors.toList()).get(0);
    }

    @RequestMapping("/getAuthorByBookId")
    public Author getAuthorByBookId(@RequestParam(value = "bookId") String bookId) {
        Book b = Repository.BOOKS.stream().filter(book -> bookId.equals(book.getId())).collect(Collectors.toList()).get(0);
        return Repository.AUTHORS.stream().filter(author -> b.getAuthorId().equals(author.getId())).collect(Collectors.toList()).get(0);
    }

    @RequestMapping("/getBooksByAuthorId")
    public List<Book> getBooksByAuthorId(@RequestParam(value = "authorId") String authorId) {
        return Repository.BOOKS.stream().filter(book -> authorId.equals(book.getAuthorId())).collect(Collectors.toList());
    }
}
