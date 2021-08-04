package com.github.dhirabayashi.designpattern.strategy;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStrategy implements Strategy {
    private final Random rand;

    public RandomStrategy() {
        rand = ThreadLocalRandom.current();
    }


    @Override
    public Hand nextHand() {
        return Hand.getHand(rand.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
