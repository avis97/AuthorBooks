package com.Author.practiceAuthor.Entitys;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String bookDetails;
    private int price;
    private int pages;
    @JoinColumn
    @ManyToOne
    private Author author;

    public Book(int bookId, String bookName, String bookDetails, int price, int pages, Author author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDetails = bookDetails;
        this.price = price;
        this.pages = pages;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookDetails='" + bookDetails + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                ", author=" + author +
                '}';
    }
}
