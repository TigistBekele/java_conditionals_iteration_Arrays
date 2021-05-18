package com.helloworld;

public class Book {
 public String title;
 public String author;
 public int edition;
 public int dateofpublish;
	
//	constructor
 
 public Book(String title, String author, int edition, int dateofpublish) {
	 this.title = title;
	 this.author = author;
	 this.edition = edition;
	 this.dateofpublish = dateofpublish;
 }
 
 public void typeof() {
	 System.out.println(this.title + " is kids book" + "the author is " + this.author);
	 }
 
 public void howmanytimesedited() {
	 System.out.println(this.title + " is kids book" + this.author + "times edited");
	 }
 
 
 public void dateofedition() {
	 System.out.println(this.title + " is kids book" + this.author + "times edited");
	 }
 
}
