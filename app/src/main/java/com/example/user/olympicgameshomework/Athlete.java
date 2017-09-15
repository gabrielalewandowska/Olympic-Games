package com.example.user.olympicgameshomework;

/**
 * Created by user on 15/09/2017.
 */

public class Athlete extends Competitor {
    private String name;


    public Athlete(String name, Country country) {
        super(country);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
