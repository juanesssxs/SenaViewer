package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

public class Magazine {
    int id;
    private String title;
    private BaseCalendar.Date editionDate;
    private String editorial;
    String authors;

    public Magazine(String title, BaseCalendar.Date editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
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
}
