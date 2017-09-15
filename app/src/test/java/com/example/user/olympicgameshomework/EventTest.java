package com.example.user.olympicgameshomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/09/2017.
 */

public class EventTest {
    Event teamEvent;
    Event athleteEvent;
    Team team;
    Athlete athlete1;
    Athlete athlete2;

    @Before
    public void before(){
        teamEvent = new Event(Sport.FIGURESKATING, 2);
        team = new Team(Country.RUSSIA);
        athlete1 = new Athlete("Tatiana Navka", Country.RUSSIA);
        athlete2 = new Athlete("Roman Kostomarov", Country.RUSSIA);
    }

    @Test
    public void canGetSport(){
        assertEquals(Sport.FIGURESKATING, teamEvent.getEventType());
    }

    @Test
    public void canGetNumberOfCompetitors() {
        assertEquals(2, teamEvent.getMaximumNumberOfCompetitors());
    }

    @Test
    public void startsWithoutCompetitors(){
        assertEquals(0, teamEvent.getCompetitors().size());
    }

    @Test
    public void canAddCompetitors(){
        teamEvent.addCompetitors(team);
        assertEquals(team, teamEvent.getCompetitors().get(0));
    }
}
