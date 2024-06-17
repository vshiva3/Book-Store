package com.knowledgebookstore.booksstore.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.knowledgebookstore.booksstore.customvalidators.CheckIfBookExists;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Books")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@CheckIfBookExists(message = "Book already exists")
    @NotBlank(message = "Book name can't be null")
    @Column(name = "book_name")
    private String bookName;
    @NotBlank(message = "Author can't be blank")
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "rating")
    private Float rating;


    
}
