package com.Author.practiceAuthor.Service.Impl;

import com.Author.practiceAuthor.Entitys.Author;
import com.Author.practiceAuthor.Repository.AuthorRepo;
import com.Author.practiceAuthor.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepo authorRepo;
   public Author addAuthor(Author author){

       Author author1=new Author();
       author1.setFirstName(author.getFirstName());
       author1.setLastName(author.getLastName());
       author1.setAge(author.getAge());
       author1.setPhnNumber(author.getPhnNumber());

       authorRepo.save(author1);

       return author1;
   }

}
