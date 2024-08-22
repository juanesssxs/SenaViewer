package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

import java.sql.Time;


public class Book {
    int id;
    private String title;
    private BaseCalendar.Date editionDate;
    private String editorial;
    String authors;
    private int isbn;
    boolean readed;
    Time timeReaded;

    public Book(String title, BaseCalendar.Date editionDate, String editorial, int isbn) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BaseCalendar.Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(BaseCalendar.Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}