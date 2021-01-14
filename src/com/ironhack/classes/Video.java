package com.ironhack.classes;

/** Abstract class for exercise number 4*/

public abstract class  Video {
    // Properties
    protected String name;
    protected String yearOfCreation;
    protected int rating;

    // Constructor
    public Video(String name, String yearOfCreation, int rating) {
        setName(name);
        setYearOfCreation(yearOfCreation);
        setRating(rating);
    }

    // Abstract method
    public abstract String getVideoInfo();

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
