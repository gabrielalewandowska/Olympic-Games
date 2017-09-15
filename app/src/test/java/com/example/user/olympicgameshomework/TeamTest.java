package com.example.user.olympicgameshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class TeamTest {
    Team team;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        team = new Team(Country.RUSSIA);
        athlete1 = new Athlete("Tatiana Navka", Country.RUSSIA);
        athlete2 = new Athlete("Roman Kostomarov", Country.RUSSIA);
    }

    @Test
    public void teamStartsWithoutMembers(){
        assertEquals(0, team.getTeamMembers().size());
    }

    @Test
    public void canGetCountry(){
        assertEquals(Country.RUSSIA, team.getCountry());
    }

    @Test
    public void canGetScore(){
        assertEquals(0, team.getScore());
    }

    @Test
    public void startsWith0Medals(){
        assertEquals(0, team.getMedal().get("gold"));
        assertEquals(0, team.getMedal().get("silver"));
        assertEquals(0, team.getMedal().get("bronze"));
    }
}
