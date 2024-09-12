package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

import java.sql.Time;
import java.util.Date;


public class Book extends Publication {
    int id;
    private int isbn;
    boolean readed;
    Time timeReaded;

    public Book(String title, Date editionDate, String editorial, String authors, int id, int isbn, boolean readed, Time timeReaded) {
        super(title, editionDate, editorial, authors);
        this.id = id;
        this.isbn = isbn;
        this.readed = readed;
        this.timeReaded = timeReaded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public Time getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(Time timeReaded) {
        this.timeReaded = timeReaded;
    }

}
