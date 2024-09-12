package edu.misena.senaviewer.model;

public class Series extends Film{
    int year;
    Boolean viewed;
    int timeViewed;
    int sessionQuatity;

    public Series(String title, String genre, String creator, int duration) {
        super(title, genre, creator, duration);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuatity() {
        return sessionQuatity;
    }

    public void setSessionQuatity(int sessionQuatity) {
        this.sessionQuatity = sessionQuatity;
    }
}
