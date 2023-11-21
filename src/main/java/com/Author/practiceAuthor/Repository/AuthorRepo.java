package com.Author.practiceAuthor.Repository;

import com.Author.practiceAuthor.Entitys.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer>{
    Author findByFirstName(String name);
}
