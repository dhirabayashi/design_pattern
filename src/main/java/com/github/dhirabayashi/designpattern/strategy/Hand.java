package com.github.dhirabayashi.designpattern.strategy;

public enum Hand {
    GUU("グー", 0),
    CHOKI("チョキ", 1),
    PAA("パー", 2);

    private final String name;
    private final int handValue;

    Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return values()[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if(this == h) {
            return 0;
        } else if((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
