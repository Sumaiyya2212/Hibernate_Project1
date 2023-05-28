package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="book_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int bookId;
	 @Column(name="book_name",length=30)
     private String bookname;
	 @Column(name="book_price",length=10)
     private double bookPrice;
	 @Column(name="book_pages",length=10)
     private int bookPages;
     
     @ManyToOne//many books can be written by one author
     private Author author;
     
}
