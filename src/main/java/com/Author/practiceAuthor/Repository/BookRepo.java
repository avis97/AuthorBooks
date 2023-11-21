package com.Author.practiceAuthor.Repository;

import com.Author.practiceAuthor.Entitys.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{

}
