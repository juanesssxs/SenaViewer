package edu.misena.senaviewer.model;

import sun.util.calendar.BaseCalendar;

public class Movie extends Film{
    int year;
    boolean view;
    int timeViewed;

    public Movie(String title, String genre, String creator, int duration, BaseCalendar.Date year) {
        super(title, genre, creator, duration);

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}

