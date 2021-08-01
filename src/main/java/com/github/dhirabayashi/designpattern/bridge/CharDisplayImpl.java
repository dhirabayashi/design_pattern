package com.github.dhirabayashi.designpattern.bridge;

public class CharDisplayImpl implements DisplayImpl {
    private final char start;
    private final char aChar;
    private final char end;

    public CharDisplayImpl(char start, char aChar, char end) {
        this.start = start;
        this.aChar = aChar;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(aChar);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
