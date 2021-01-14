package com.ironhack.classes;
import java.util.Locale;

/** Class that implements abstract class for exercise 4 */

public class Movie extends Video {
    // Properties
    protected int oscars;

    // Constructor
    public Movie(String name, String yearOfCreation, int rating, int oscars) {
        super(name, yearOfCreation, rating);
        setOscars(oscars);
    }

    @Override
    public String getVideoInfo() {
        String info;
        if (oscars != 0) {
            info = ("La película " + getName().toUpperCase(Locale.ROOT) + " vió la luz en " + getYearOfCreation() +
                    ". Ha ganado " + getOscars() + " premios Oscars, y los usuarios la han votado con " + getRating() + " estrellas.");
        } else {
            info = ("La película " + getName().toUpperCase(Locale.ROOT) + " vió la luz en " + getYearOfCreation() +
                    " y los usuarios la han votado con " + getRating() + " estrellas.");
        }
        return info;
    }

    // Getters & Setters
    public int getOscars() {
        return oscars;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }
}
