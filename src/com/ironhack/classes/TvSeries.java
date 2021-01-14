package com.ironhack.classes;
import java.util.Locale;

/** Class that implements abstract class for exercise 4 */

public class TvSeries extends Video {
    // Properties
    protected String seasons;

    // Constructor
    public TvSeries(String name, String yearOfCreation, int rating, String seasons) {
        super(name, yearOfCreation, rating);
        setSeasons(seasons);
    }

    @Override
    public String getVideoInfo() {
        String info = ("La serie de televisión " + getName().toUpperCase(Locale.ROOT) + " lanzó su primer capítulo en " + getYearOfCreation() +
                ". Tiene " + getSeasons() + " temporadas y los usuarios la han votado con " + getRating() + " estrellas.");
        return info;
    }

    // Getters & Setters
    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
}
