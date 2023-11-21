package com.Author.practiceAuthor.Entitys;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String firstName;
    private String lastName;
    private String phnNumber;
    private int age;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> bookList;

    public Author(int authorId, String firstName, String lastName, String phnNumber, int age, List<Book> bookList) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phnNumber = phnNumber;
        this.age = age;
        this.bookList = bookList;
    }
    public Author(){
        super();
    }
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phnNumber='" + phnNumber + '\'' +
                ", age=" + age +
                ", bookList=" + bookList +
                '}';
    }
}
