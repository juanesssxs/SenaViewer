package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

public class Movie {
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private BaseCalendar.Date year;
    boolean view;
    int timeViewed;

    public Movie(String title, String genre, String creator, int duration, BaseCalendar.Date year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BaseCalendar.Date getYear() {
        return year;
    }

    public void setYear(BaseCalendar.Date year) {
        this.year = year;
    }
}
