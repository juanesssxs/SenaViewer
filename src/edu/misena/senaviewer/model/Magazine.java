package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Magazine extends Publication{
    int id;

    public Magazine(String title, Date editionDate, String editorial, String authors) {
        super(title, editionDate, editorial, authors);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}