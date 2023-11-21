package com.Author.practiceAuthor.Controller;

import com.Author.practiceAuthor.Entitys.Author;
import com.Author.practiceAuthor.Service.Impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorServiceImpl authorService;

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author){
        Author author1;
        author1=authorService.addAuthor(author);
        return author1;
    }
}
