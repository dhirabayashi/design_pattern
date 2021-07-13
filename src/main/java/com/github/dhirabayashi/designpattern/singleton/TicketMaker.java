package com.github.dhirabayashi.designpattern.singleton;

public class TicketMaker {
    private TicketMaker() {}

    private static int ticket = 1000;
    public static int getNextTicketNumber() {
        return ticket++;
    }
}
