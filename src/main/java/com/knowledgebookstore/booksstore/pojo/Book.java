package com.knowledgebookstore.booksstore.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.knowledgebookstore.booksstore.customvalidators.CheckIfBookExists;

import jakarta.validation.constraints.NotBlank;

public class Book {


    
    private int id;
    @CheckIfBookExists(message = "Book already exists")
    @NotBlank(message = "Book name can't be null")
    private String bookName;
    @NotBlank(message = "Author can't be blank")
    private String authorName;
    private BigDecimal price;
    private Float rating;


    public String getBookName() {
        return this.bookName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, RoundingMode.HALF_UP);
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", bookName='" + getBookName() + "'" +
            ", authorName='" + getAuthorName() + "'" +
            ", price='" + getPrice() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }
    

    public Book() {
    }

    public Book(int id, String bookName, String authorName, BigDecimal price, Float rating) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.rating = rating;
    }

    public Book(Book book){
        this.id = book.id;
        this.bookName = book.bookName;
        this.authorName = book.authorName;
        this.price = book.price;
        this.rating = book.rating;
    }
}
