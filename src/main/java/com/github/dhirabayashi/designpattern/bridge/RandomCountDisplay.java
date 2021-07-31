package com.github.dhirabayashi.designpattern.bridge;

import java.util.concurrent.ThreadLocalRandom;

public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        var rand = ThreadLocalRandom.current();
        var count = rand.nextInt(times);
        multiDisplay(count);
    }
}
