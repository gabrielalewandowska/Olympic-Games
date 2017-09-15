package com.example.user.olympicgameshomework;

import java.util.Random;

/**
 * Created by user on 15/09/2017.
 */

public class NumberGenerator {
    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(100);

    }
}
