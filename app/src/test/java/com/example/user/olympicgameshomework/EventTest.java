package com.example.user.olympicgameshomework;

import org.junit.Before;

/**
 * Created by user on 15/09/2017.
 */

public class EventTest {
    Event<Team> teamEvent;
    Event<Athlete> athleteEvent;

    @Before
    public void before(){
        teamEvent = new Event<Team>(Sport.FIGURESKATING, 2);
    }
}
