package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapter {
    int id;
    private String title;
    private int duration;
    private Date year;
    boolean view;
    int timeViewed;
    int sessionNumber;

    public Chapter(String title, int duration, Date year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}
