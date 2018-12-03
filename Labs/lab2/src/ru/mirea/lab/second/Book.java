package ru.mirea.lab.second;

import java.util.Date;

public class Book {
    private int pages;
    private Date creationDate;
    private String author;
    private String name;

    public Book(int pages, Date creationDate, String author, String name){
        this.pages = pages;
        this.creationDate = creationDate;
        this.author = author;
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
