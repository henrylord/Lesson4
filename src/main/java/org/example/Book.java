package org.example;

public class Book {

    private String title = "Castle in the Sky";
    private String author = "Hayao Miyazaki";
    private int yearOfPublication = 1986;


    public String getTitle(){
       return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}